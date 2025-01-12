package Dailysum.jan25;

public class constructKpallindromstring {
/*
 * How do we figure it out without watching hints?
Try to take and experiment with some palindromes
What is a Palindrome?
Reads same from front and back
Now say any character has even count,
example : aaaa (It's always a palindrome in itself), Even if I divide into 2, it will be always a palindrome(aa,aa 2 palindromes)
even if I divide into 4 , it will remain a palindrome(Each character a palindrome)

In general an even count character, can help in forming any number of palindromes from 1 to its length
Example : aaaa

4 palindromes(a,a,a,a)
3 palindromes(a,aaa)
2 palindromes(aa,aa)
1 palindrome(aaaa)
That's from where we think of base case as
if k>s.length() cant even form more palindromes than length return false
if k==length return true
Now what if odd Count. Let's try to think
Say
Our input string s contained 4 a's and b's (Remember order doesnt matter, only count matter)

Now aaaa & b can be able to construct
1.) One palindrome aabaa(Keep the odd char in between those having even count for a palindrome). No more palindromes? Yes, no more
2.) Now say there was a 'c' too we have 2 characters having odd count, so 2 palindromes can easily be constructed aca& aba.
3.) Now let's say only we had 3 b's (ODD)

bb , b (2 palindromes can be constructed)
Say we had another 3 a's and 3 b's in total, and k=1

Remember 2 characters with odd count can't go in a single palindrome(if we utilize their odd number)

So in short if (number of character having odd count>k) return false;
 */
    private static boolean sol1(String s , int k ){
       

        int[]freqmap = new int[26];
        for(int i=0;i<s.length();i++){
            freqmap[s.charAt(i)-'a']++;
        }
        int oddcount=0;
        for(int i=0;i<26;i++){
            if(freqmap[i]%2==0){
                oddcount++;
            }
        }
        if(s.length()<k){
            return false;
        }
        else if(oddcount>k){
            return false;
        }
        else{
            return true;

        }

    }

    public static void main(String[] args) {
        
    }
}