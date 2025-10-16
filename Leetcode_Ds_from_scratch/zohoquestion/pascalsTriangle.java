package Leetcode_Ds_from_scratch.zohoquestion;

import java.util.ArrayList;

public class pascalsTriangle {
    private static ArrayList<ArrayList<Integer>> res (int n ){
         ArrayList<ArrayList<Integer>> result = new ArrayList<>();
             ArrayList<Integer> list , pre= null;
             for(int i=0;i<n;i++){
                list = new ArrayList<>();
                for(int j=0;j<=i;j++){
                    if(j==0 || j==i){
                        list.add(1);
                    }
                    else{
                        list.add(pre.get(j-1) +pre.get(j));
                    }
                }
                pre = list;
                result.add(list);
                
             }
             return result;
    }
    private static void pascalTriangal (int n ){
        ArrayList<ArrayList<Integer> > res= new ArrayList<>();
        ArrayList<Integer>   list ,prev=null;

        for(int i=0;i<n;i++){ 
            list=new ArrayList<>();
            for(int j=0;j<=i;j++){
               
                if(j==0||j==i){
                    list.add(1);
                }
                else{
                    list.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev=list;
            res.add(list);
        }
        System.out.println(res);

    }
    public static void main(String[] args) {
      pascalTriangal(5);
    }
}
