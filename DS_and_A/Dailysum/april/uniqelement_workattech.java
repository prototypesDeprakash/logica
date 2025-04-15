package Dailysum.april;

public class uniqelement_workattech {

    private static void sol1(int[]arr){
        int i=0;
        int j=arr.length-1;
        int c=0;
        while (i<j) {
            while(i!=j && arr[i]==arr[i+1]){
                i++;
                c++;
            }
            while(i!=j && arr[j]==arr[j-1]){
                j--;
                c++;
            }
            i++;
        }
        System.out.println(arr.length-c);
    }
    public static void main(String[] args) {
        int[]a={1,2, 3 ,3 ,3 ,4, 5, 5};
        sol1(a);

    }
}