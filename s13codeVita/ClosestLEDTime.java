package s13codeVita;
import java.util.*;

public class ClosestLEDTime {
    
    // Segment patterns for digits 0-9
    static int[] segments = {
        0b0111111, // 0
        0b0000110, // 1  
        0b1011011, // 2
        0b1001111, // 3
        0b1100110, // 4
        0b1101101, // 5
        0b1111101, // 6
        0b0000111, // 7
        0b1111111, // 8
        0b1101111  // 9
    };
    
    // Check if two times differ by exactly one segment
    static boolean differsByOneSegment(String time1, String time2) {
        int diffCount = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue; // skip colon
            
            char c1 = time1.charAt(i);
            char c2 = time2.charAt(i);
            
            if (c1 == ' ' && c2 != ' ') {
                diffCount += Integer.bitCount(segments[c2 - '0']);
                if (diffCount > 1) return false;
            } else if (c1 != ' ' && c2 == ' ') {
                diffCount += Integer.bitCount(segments[c1 - '0']);
                if (diffCount > 1) return false;
            } else if (c1 != c2) {
                int seg1 = segments[c1 - '0'];
                int seg2 = segments[c2 - '0'];
                diffCount += Integer.bitCount(seg1 ^ seg2);
                if (diffCount > 1) return false;
            }
        }
        return diffCount == 1;
    }
    
    // Format time in HH:MM format with leading spaces for single-digit hours
    static String formatTime(int hour, int minute) {
        if (hour < 10) {
            return " " + hour + ":" + String.format("%02d", minute);
        } else {
            return hour + ":" + String.format("%02d", minute);
        }
    }
    
    // Calculate cost to move hands
    static int calculateCost(int h1, int m1, int h2, int m2, int X, int Y) {
        // Convert to minutes for easier calculation
        int totalMins1 = (h1 % 12) * 60 + m1;
        int totalMins2 = (h2 % 12) * 60 + m2;
        
        int diff = Math.abs(totalMins2 - totalMins1);
        diff = Math.min(diff, 12 * 60 - diff); // wrap around
        
        return (diff / 60) * 60 * X + (diff % 60) * Y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initialTime = sc.next();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        // Parse initial time
        int initHour = Integer.parseInt(initialTime.substring(0, 2));
        int initMinute = Integer.parseInt(initialTime.substring(3, 5));
        
        // Convert to 12-hour format
        if (initHour == 0) initHour = 12;
        else if (initHour > 12) initHour -= 12;
        
        String initTimeFormatted = formatTime(initHour, initMinute);
        
        int bestHour = -1, bestMinute = -1;
        int minCost = Integer.MAX_VALUE;
        
        // Check all possible times
        for (int hour = 1; hour <= 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                String newTime = formatTime(hour, minute);
                
                if (differsByOneSegment(initTimeFormatted, newTime)) {
                    int cost = calculateCost(initHour, initMinute, hour, minute, X, Y);
                    if (cost < minCost) {
                        minCost = cost;
                        bestHour = hour;
                        bestMinute = minute;
                    }
                }
            }
        }
        
        if (bestHour == -1) {
            System.out.println("No closest valid time possible");
        } else {
            System.out.printf("%02d:%02d\n", bestHour, bestMinute);
        }
    }
}