public class decimaltobinaryrecursion {
    public static String DecimalToBin(int decimal , String result){
        if(decimal==0){
            return result;
        }
        result= decimal%2 + result;
        return(DecimalToBin(decimal/2,result));
    }

    public static void main(String[]args){
        int Decimal = 233;
        String result="";
        System.out.println(DecimalToBin(Decimal, result));
        
        
    }
}
