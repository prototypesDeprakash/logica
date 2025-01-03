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


    private void addStudentsatback(){
        ListNode newNode  = head;
        if(head==null){
            head= newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        //step 2 is to make the base part of the 
    }

    private static void sol(){

    }

    private static int countSolution(int[]students , int[]sandwiches){
        //sandwitch is stack
        //forom students take zero count and one count
        int zerocount=0;
        int onecount=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0){
                zerocount++;
            }else{
                onecount++;
            }
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0 && zerocount!=0){
                zerocount--;
            }else if(sandwiches[i]==1 &&onecount!=0){
                onecount--;
            }
            if( sandwiches[i]==0 &&  zerocount==0){
                return onecount;
            }
            if( sandwiches[i]==1 && onecount==0){
                return zerocount;
            }
        }
        return 0;
                
    }


    private static int normalSOlution(int[] Students, int[]sandwiches){
        ArrayList<Integer> arr = new ArrayList<>(); //students
        ArrayList<Integer> sandarr = new ArrayList<>(); //sandwiches
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
