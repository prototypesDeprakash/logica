package Array;

/**
 * removeelement
 */
public class removeelement {

    public static void main(String[] args) {
        int [] a = {3,2,2,3,2,2,2,2,2,3,3,3,3};
        int val = 3;
        //output should be [2,2,_,_];

        //first move all the val to the end 
        int i =0;
        int j=a.length-1;
        while(i<=j){
            if(a[i]==val && a[j]!=val){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;

                i++;
                j--;

            }
            else if(a[i]==val){
                j--;
            }else{
                i++;
            }
        }
        
        for(int k=0;k<a.length;k++){
            if(a[k]==val){
                a[k]=0;
            }
        }

    }

}