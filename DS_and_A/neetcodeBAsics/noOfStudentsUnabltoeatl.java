package neetcodeBAsics;

import java.util.ArrayList;

public class noOfStudentsUnabltoeatl {
 
    class ListNode{
        int data;
        ListNode next;
        public  ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    private static  ListNode head;
    private static ListNode tail;


    private void addStudentsatback(int n){
        ListNode newNode  = new ListNode(n);
        if(head==null){
            head= newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    private static int normalSOlution(int[] Students, int[]sandwiches){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> sandarr = new ArrayList<>();
        for(int i=0;i<sandwiches.length;i++){
            sandarr.add(sandwiches[i]);
        }
        for(int i=0;i<Students.length;i++){
            arr.add(Students[i]);
        }
       int attempts=0;
        while(!sandarr.isEmpty() && attempts<arr.size()){
            
            if(arr.get(0)==sandarr.get(0)){
                arr.remove(0);
                sandarr.remove(0);
                attempts=0;
            }else{
                
                arr.add(arr.remove(0));
                attempts++;
                
               
            }
            
        }
        if(arr.isEmpty() && sandarr.isEmpty()){
            return 0;
        }else{
            return arr.size();
        }
    }

    private static void sol1(){
//students = [1,1,0,0], sandwiches = [0,1,0,1]
    }
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches ={1,0,0,0,1,1};
        System.out.println(normalSOlution(students, sandwiches));

         /*
Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
Output: 0 
Explanation:
- Front student leaves the top sandwich and returns to the end of the line making students = [1,0,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,0,1,1].
- Front student takes the top sandwich and leaves the line making students = [0,1,1] and sandwiches = [1,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [1,1,0].
- Front student takes the top sandwich and leaves the line making students = [1,0] and sandwiches = [0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,1].
- Front student takes the top sandwich and leaves the line making students = [1] and sandwiches = [1].
- Front student takes the top sandwich and leaves the line making students = [] and sandwiches = [].
Hence all students are able to eat.
          */
    }
}
