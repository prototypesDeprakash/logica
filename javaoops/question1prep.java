package javaoops;
import java.nio.channels.Channel;
import java.util.HashMap;
import java.util.Scanner;

//import Dailysum.DigitalBasics.primeNumber;
public class question1prep {


  public static void Remove_a_Given_Character_from_aString(String str,String remove_char){

   
    // String res="";
    // for(int i=0;i<s.length();i++){
    //   if(s.charAt(i)!=remove_char){
    //     res+=s.charAt(i);
    //   }
    // }
    
     System.out.println(str.replace(remove_char, ""));
  }

public static void Reverse_the_Word_Order_in_a_Sentence(String s){

  s =s.trim();
  String[]words=s.split("\\s+");
  int left =0;
  int right =words.length-1;
  while (left<right) {
    String temp = words[left];
    words[left]=words[right];
    words[right]=temp;
    left++;
    right--;
  }

  String res ="";
 for (int i=0;i<words.length;i++){
  res+=words[i];
  if(i!=words.length-1){
    res+=" ";
  }
 }
 System.out.println(res);
}

  public static String reverseAstring(String str){
    char[] s = str.toCharArray();
    int left=0;
    int right= str.length()-1;

    while (left<right) {
      char temp = s[left];
      s[left]=s[right];
      s[right]=temp;
      left++;
      right--;
    }
  return new String(s);
  }
  public static void reverseeachWord(String sen){
    sen =sen.trim();
    String res="";
      String[] words = sen.split("\\s+");
      for(String word :words){
         res+=(reverseAstring(word));
         res+=" ";
      }
      System.out.println(res.trim());
  }

  public static void reversewithstringbuilder(String s){
    StringBuilder result  = new StringBuilder();
     s = s.trim();

     String[]words = s.split("\\s+");
     int i=0;
    for(String word: words){
      result.append(new StringBuilder(word).reverse());
      i++;
      if(i!=words.length){
        result.append(" ");
      }
      
    }
    System.out.println(result.toString());
  }

  public static void countofevenandodddigitsinanumber(int num){
    int even =0;
    int odd=0;
    int n =Math.abs(num);
    if(num==0)even=1;
    while (n!=0) {
      int temp = n%10;
      if(temp%2==0){
        even++;
      }else{
        odd++;
      }
      n=n/10;
    }
    System.out.println(even);
    System.out.println(odd);

  }

  public static void countOccurenceofgivenchar(String str , char target){
    int occurance =0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)==target){
        occurance++;
      }
    }
    System.out.println(occurance);
  }
  public static void frequencyof_eachchar(String str){
    HashMap<Character,Integer> my_map = new HashMap<>();
    for(int i=0;i<str.length();i++){
      my_map.put(str.charAt(i), my_map.getOrDefault(str.charAt(i), 0)+1);
    }
    System.out.println(my_map);

  }
  public static void count_wordsinSentence(String str){
     
      str =str.trim();
      String[] s = str.split("\\s+");
      System.out.println(s.length);
  }
  public static  void count_digits_letter_special_white(String str){

    int letter=0;
    int special =0;
    int digit =0;
    int whitespace = 0;

    for(int i=0;i<str.length();i++){
      char c=  str.charAt(i);

      if(Character.isDigit(c))digit++;
      else if(Character.isLetter(c))letter++;
      else if(Character.isWhitespace(c))whitespace++;
      else special++;

    }
    System.out.println("letter "+letter );
    System.out.println("Special "+special);
    System.out.println("Digit "+digit);
    System.out.println("Whitespaces "+whitespace);
  }

  public static void countVovelsansConsonents(String str){
    int vovel=0;
    int cons=0;
    for(int i=0;i<str.length();i++){

      if(Character.isLetter(str.charAt(i))){
        char c =Character.toLowerCase(str.charAt(i));
        if(c=='a'){
          vovel++;
        }
        else if(c=='e') vovel++;
        else if(c=='i') vovel++;
        else if (c=='o')vovel++;
        else if (c=='u')vovel++;
        else{cons++;}
      }
    }
    System.out.println(vovel);
    System.out.println(cons);

  }
  public static void countUpperandlowercase(String str){
    int caps =0;
    int lows=0;
    for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      if(Character.isUpperCase(c) ){
        caps++;
      }
      if(Character.isLowerCase(c)){
        lows++;
      }
    }
    System.out.println(caps);
    System.out.println(lows);

  }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          //countVovelsansConsonents(s);
         // count_digits_letter_special_white(s);
         //count_wordsinSentence(s);
        // frequencyof_eachchar(s);
        //countOccurenceofgivenchar(s, 'x');
        //countofevenandodddigitsinanumber(12345);
        //reverseAstring(s);
       // reversewithstringbuilder(s);
       //Reverse_the_Word_Order_in_a_Sentence(s);
       //Remove_a_Given_Character_from_aString(s,"l");
    }
}
