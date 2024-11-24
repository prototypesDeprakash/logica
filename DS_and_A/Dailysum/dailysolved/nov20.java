package Dailysum.dailysolved;

import java.util.HashMap;
import java.util.Map;

public class nov20 {

    private static boolean checkifValid(char[]chararr,int k){
        HashMap<Character,Integer> myFreqMap = new HashMap<>();
        for(char ch : chararr){
            myFreqMap.put(ch,myFreqMap.getOrDefault(ch, 0)+1);
        }
        //System.out.println(myFreqMap);
        //System.out.println(myFreqMap.get('a'));
       for(Map.Entry<Character,Integer>myentry : myFreqMap.entrySet()){
        char key = myentry.getKey();
        int value = myentry.getValue();
        if(value<k){
            return false;
        }
       }
       return true;

    }
    private static int solw(String s , int k){
        
                int n = s.length();
                int[] freq = new int[3]; // Frequency array for 'a', 'b', 'c'
        
                // Expand the left pointer until all characters meet the condition
                int left = 0;
                while (left < n && (freq[0] < k || freq[1] < k || freq[2] < k)) {
                    freq[s.charAt(left) - 'a']++;
                    left++;
                }
        
                // If it's impossible to satisfy the condition
                if (freq[0] < k || freq[1] < k || freq[2] < k) {
                    return -1;
                }
        
                // Initialize shortest valid segment
                int shortest = left;
                left--; // Adjust left to last valid position
                int right = n - 1;
        
                // Shrink the left window and adjust the right pointer
                while (left >= 0) {
                    freq[s.charAt(left) - 'a']--;
                    left--;
        
                    // Expand the right pointer if the condition is violated
                    while (left <= right && (freq[0] < k || freq[1] < k || freq[2] < k)) {
                        freq[s.charAt(right) - 'a']++;
                        right--;
                    }
        
                    // Update shortest valid segment
                    shortest = Math.min(shortest, n - (right - left));
                }
        
                return shortest;
            
        
    }
    private static int sol1(char[] charArr , int k){
        int res=0;
        HashMap<Character,Integer> currentmap = new HashMap<>();
        int l=0;
        int r=0;
        int shortL=0;
        while (l<charArr.length) {
            if(!checkifValid(charArr, k)){
                currentmap.put(charArr[l], currentmap.getOrDefault(charArr[l], 0)+1);
            }
            l++;
            shortL=l;
            if(checkifValid(charArr, k)){
                shortL-=1;

            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        String s = "aabaaaacaabc";
    //   System.out.println( checkifValid(s.toCharArray(),2));
       sol1(s.toCharArray(), 100);
    }
}