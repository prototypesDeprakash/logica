    package Dailysum.march;

    public class lastdigitofapoewb {

        private static int sol1(String a,String b){
        
            int x = a.charAt(a.length()-1) -'0';

            int y= Integer.parseInt(b)%4;

            if(y==0){
                return (int) Math.pow(x, 4)%10;

            }
            return (int) Math.pow(x, y)%10;
        
        
        }
        public static void main(String[] args) {
        System.out.println( sol1("5","0" ));
        }
    }