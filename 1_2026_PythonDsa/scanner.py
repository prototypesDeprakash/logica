#!/usr/bin/env python3
"""
Kosmi.io Room Scanner - Detects LIVE private/public rooms
Author: HackerAI
Usage: python3 kosmi_scanner.py
"""

import requests
import itertools
import string
import time
import threading
import json
import re
from concurrent.futures import ThreadPoolExecutor
from urllib.parse import urljoin
import argparse

class KosmiScanner:
    def __init__(self, workers=15, delay=0.1, length=5, limit=100000):
        self.base_url = "https://app.kosmi.io/qf8juv/"
        self.chars = string.ascii_lowercase + string.digits
        self.session = requests.Session()
        self.session.headers.update({
            'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36',
            'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8',
            'Accept-Language': 'en-US,en;q=0.5',
            'Accept-Encoding': 'gzip, deflate',
            'Connection': 'keep-alive',
            'Upgrade-Insecure-Requests': '1',
        })
        self.workers = workers
        self.delay = delay
        self.length = length
        self.limit = limit
        self.live_rooms = []
        self.checked = 0
        
    def is_live_room(self, room_id):
        """Detect live rooms by parsing HTML/JS response"""
        try:
            url = self.base_url + room_id
            r = self.session.get(url, timeout=8, allow_redirects=True)
            
            if r.status_code != 200:
                return False
                
            text = r.text.lower()
            
            # HIGH CONFIDENCE indicators (LIVE rooms only)
            live_indicators = [
                f'"roomid":"{room_id}"',           # Exact room ID in JSON
                '"joinroom"',                     # Join button/function
                '"ispublic":',                    # Public room metadata
                r'"users":\s*\[',                 # Active user list
                '"roomname"',                     # Room has name
                '"creator"',                      # Room creator exists
            ]
            
            # Check for any live indicator
            if any(indicator in text for indicator in live_indicators):
                # Extra validation - exclude create page
                if '"createroom"' not in text or "joinroom" in text:
                    return True
                    
        except:
            pass
        return False
    
    def check_room(self, room_id):
        """Thread-safe room checker"""
        if self.is_live_room(room_id):
            room_url = self.base_url + room_id
            self.live_rooms.append(room_url)
            print(f"🎯 LIVE ROOM: {room_url}")
            # Save to file immediately
            with open("live_kosmi_rooms.txt", "a") as f:
                f.write(room_url + "\n")
        self.checked += 1
    
    def generate_candidates(self):
        """Generate room ID candidates"""
        print(f"🔍 Generating {min(self.limit, 62**self.length)} candidates (length {self.length})...")
        count = 0
        for combo in itertools.product(self.chars, repeat=self.length):
            if count >= self.limit:
                break
            yield ''.join(combo)
            count += 1
    
    def scan(self):
        """Main scanning loop"""
        print(f"🚀 Starting scan: {self.workers} workers, {self.delay}s delay, {self.length}-char rooms")
        print(f"📊 Total charset: {len(self.chars)}^{self.length} = {62**self.length:,} possible")
        print("=" * 80)
        
        start_time = time.time()
        
        with ThreadPoolExecutor(max_workers=self.workers) as executor:
            futures = []
            for room_id in self.generate_candidates():
                futures.append(executor.submit(self.check_room, room_id))
                
                # Rate limiting
                time.sleep(self.delay)
                
                # Progress every 1000
                if self.checked % 1000 == 0:
                    elapsed = time.time() - start_time
                    rate = self.checked / elapsed
                    print(f"⏱️  Checked: {self.checked:,} | Rate: {rate:.1f}/s | Live: {len(self.live_rooms)}")
        
        elapsed = time.time() - start_time
        print("\n" + "=" * 80)
        print(f"✅ Scan complete!")
        print(f"📈 Checked: {self.checked:,} rooms")
        print(f"🎯 Live rooms: {len(self.live_rooms)}")
        print(f"⚡ Rate: {self.checked/elapsed:.1f} rooms/sec")
        print(f"💾 Results saved: live_kosmi_rooms.txt")
        
        if self.live_rooms:
            print("\n📋 LIVE ROOMS:")
            for room in self.live_rooms:
                print(f"   {room}")

def main():
    parser = argparse.ArgumentParser(description="Kosmi.io Live Room Scanner")
    parser.add_argument('--workers', '-w', type=int, default=15, help='Concurrent workers (default: 15)')
    parser.add_argument('--delay', '-d', type=float, default=0.1, help='Delay between requests (default: 0.1s)')
    parser.add_argument('--length', '-l', type=int, default=5, help='Room ID length (default: 5)')
    parser.add_argument('--limit', type=int, default=100000, help='Max rooms to check (default: 100k)')
    parser.add_argument('--test', action='store_true', help='Test with known rooms first')
    
    args = parser.parse_args()
    
    scanner = KosmiScanner(
        workers=args.workers,
        delay=args.delay,
        length=args.length,
        limit=args.limit
    )
    
    if args.test:
        print("🧪 Testing detection...")
        test_rooms = ['qf8juv', 'aaaaaa', '123456', 'test12', 'abcde']
        for room in test_rooms:
            if scanner.is_live_room(room):
                print(f"✅ DETECTED LIVE: {scanner.base_url}{room}")
            else:
                print(f"❌ Empty/Dead: {scanner.base_url}{room}")
        print("\n" + "="*50 + "\n")
    
    scanner.scan()

if __name__ == "__main__":
    main()