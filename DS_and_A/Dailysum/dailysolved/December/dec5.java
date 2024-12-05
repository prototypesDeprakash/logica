public class dec5 {


    private static boolean sol1(String s1 , String s2){
        int a = 0;
        int b = 0;
        int n = s2.length();

       while (a<n || b<n) {
        
        while (a<n && s1.charAt(a)=='_') 
            a++;
        while (b<n && s2.charAt(b)=='_')
            b++;
        if(s1.charAt(a)!=s2.charAt(b))          
            return false;                                                                                           
        
        if(s1.charAt(a)=='L' && a<b)
            return false;
        if(s1.charAt(a)=='R' && a>b)
            return false;
        a++;
        b++;
       }
    return a==n && b==n;
       
    }

    public static void main(String[] args) {
        
    }
}