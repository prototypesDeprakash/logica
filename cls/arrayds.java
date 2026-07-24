package cls;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class arrayds {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int []arr2=new int[5];
        int arr3[]={1,3,4,5};


    }
public static void queuebasic(){
    Queue queue = new LinkedList<>();
    queue.offer(10);
    queue.peek();
    queue.isEmpty();
    queue.poll();
}

    public static void stackbasic(){
        Stack stack = new Stack<>();
        stack.add(3);
        stack.pop();
        stack.peek();
    }
    public static void twopoint(int[]arr,int target){
        int left =0;
        int right = arr.length-1;
        while (left<right) {
            if(arr[left]+arr[right]==target){
                System.out.print("target found");
                break;
            }
            else if(arr[left]+arr[right]<target){
                left+=1;
            }
            else{
                right-=1;
            }
        }
    }
}
