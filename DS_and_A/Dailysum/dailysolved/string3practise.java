package Dailysum.dailysolved;

public class string3practise {

    private static void display(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private static boolean solution(String s1 , String s2 ){
        String temp="";
        if(s1.length()>s2.length()){
            temp=s1;
            s1=s2;
            s2=temp;
        }
        String[] word1 =s1.split(" ");
        String[] word2 = s2.split(" ");
        //prefix calculation
        int l =0;
        while (l<word1.length && word1[l].equals(word2[l])) {
            l++;

           
        }
        //suffix calculation

        int r1=word1.length-1;
        int r2=word2.length-1;
        int t=0;

      
     

        while (r1>=l && word1[r1].equals(word2[r2])) {
            r1--;
            r2--;
            t++;
            System.out.println("fu");

        }
        return l+t==word1.length;

    }
    public static void main(String[] args) {
        String s1="Eating right now";
        String s2="Eating";
       System.out.println(solution(s1, s2)); 
    }
}
