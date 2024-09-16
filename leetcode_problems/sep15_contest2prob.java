public class sep15_contest2prob {
   
        private static int mininarr(int[] arr){
            int mymin=arr[0];
            for(int i:arr){
                if(i<mymin){
                    mymin=i;
                }
            }
            return mymin;
        }
       public static void main(String[] args) {
            int[]a ={3,2,5,6 };
            int[] b ={2,-6,4,-5,-3,2,-7};
       
            int prev=0;
            int prev2=0;
            int prev3=0;
            int prev4=0;
    
            prev = mininarr(b);
    
            for (int i=0;i<b.length;i++){
                if(b[i]>prev){
                    prev2=b[i];
                }
                if(b[i]>prev2){
                    prev3=b[i];
                }
                if(b[i]>prev3){
                    prev4=b[i];
                }
                break;
            }

            System.out.println(prev+"  "+prev2+" "+prev3+" "+prev4);
    
            System.out.println( ((a[0] *b[0]) +(a[1]*b[1] ) +(a[2]*b[2]) + (a[3]*b[3]) ));
        }

       
    }

