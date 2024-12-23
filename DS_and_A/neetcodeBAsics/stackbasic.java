import java.util.Stack;

public class stackbasic {

    private static boolean validParenthesis(String s){
        Stack<Character> myStack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[' ||s.charAt(i)=='(' || s.charAt(i)=='{'){
                myStack.push(s.charAt(i));
            }else if(s.charAt(i)==']' ){
                if(!myStack.isEmpty() && myStack.peek()=='['){
                    myStack.pop();
                }else{
                    myStack.push(s.charAt(i));
                }
            }else if(s.charAt(i)==')'){
                if(!myStack.isEmpty() && myStack.peek()=='('){
                    myStack.pop();
                }else{
                    myStack.push(s.charAt(i));
                }

            }else if(s.charAt(i)=='}'){
                if(!myStack.isEmpty() && myStack.peek()=='{'){
                    myStack.pop();
                }else{
                    myStack.push(s.charAt(i));
                }
            }   
            
        }
        if(myStack.isEmpty()){
            return true;
        }return false;
    }
    public static void main(String[] args) {
       String s="[]";
       System.out.println(validParenthesis(s));
    }
}
