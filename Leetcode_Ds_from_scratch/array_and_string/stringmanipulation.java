package Leetcode_Ds_from_scratch.array_and_string;

public class stringmanipulation {
    public static void main(String[] args) {
        String input1 = "hey diksha hello";
String input2 = "hey sameeddiksha helloworld";

String[] words = input1.split(" ");
StringBuilder result = new StringBuilder();

for (String word : words) {
    if (input2.contains(word)) {
        result.append(word).append(" ");
    }
}

System.out.println(result.toString().trim());

    }
}
