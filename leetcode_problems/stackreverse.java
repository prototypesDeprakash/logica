import java.util.Stack;

public class stackreverse {

    public static void main(String[] args) {
        String s = "(u(love)i)";
        StringBuilder temp = new StringBuilder();
        Stack<Character> stack = new Stack();
        for ( char c : s.toCharArray()){
            if(c=='(' || (c!='(' && c!=')')){
                stack.push(c);
            }
            else if(c==')'){
                temp.setLength(0);
                while (stack.peek()!='(') {
                    temp.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
                for ( char t : temp.toString().toCharArray()){
                    stack.push(t);
                }
            }
        }
        StringBuffer result = new StringBuffer();
        for ( char ch : stack){
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}