package DSARestart_TCS_PRep;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class keyboardsimulator {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();
        boolean numLock = true;

        for (char c : s.toCharArray()) {
            if (c == '#') {
                numLock = !numLock;
            } 
            else if (c == '<') { // Home key
                while (!left.isEmpty()) {
                    right.push(left.pop());
                }
            } 
            else if (c == '>') { // End key
                while (!right.isEmpty()) {
                    left.push(right.pop());
                }
            } 
            else if (c == '*') { // Backspace
                if (!left.isEmpty()) {
                    left.pop();
                }
            } 
            else { // Normal character
                if (Character.isDigit(c) && !numLock) continue;
                left.push(c);
            }
        }

        // Combine stacks into final result
        StringBuilder result = new StringBuilder();
        for (char c : left) result.append(c);
        result.reverse();
        for (char c : right) result.append(c);

        System.out.println(result.toString());
    }

    
}
