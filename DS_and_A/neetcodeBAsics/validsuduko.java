package neetcodeBAsics;

import java.util.HashSet;

public class validsuduko {

  private static boolean colChecker(char[][]arr,int  colstart , int colend ){
    HashSet<Character> myset = new HashSet<>();

    for(int i=0;i<9;i++){
      for(int j=colstart;j<colend;j++){
       // System.out.print(arr[i][j]+' ');
        if(arr[i][j]!='.'){
          if(myset.contains(arr[i][j])){
              return false;
          }else{
              myset.add(arr[i][j]);
          }

        //

      }
    }

  }
  return true;

}

    private static boolean rowChecker(char[][]arr,int rowstart , int rowend){
      HashSet<Character> myset = new HashSet<>();


        for(int i=rowstart;i<rowend;i++){
          for(int j=0;j<arr.length;j++){
           // System.out.print(arr[i][j]+' ');
           if(arr[i][j]!='.'){
            if(myset.contains(arr[i][j])){
                return false;
            }else{
                myset.add(arr[i][j]);
            }
          }
        }
    }
    return true;

  }
    private static boolean boardBoxChecker(char[][]arr,int rowstart,int rowend, int colstart, int colend){
        HashSet<Character> myset = new HashSet<>();
        for(int i=rowstart;i<rowend;i++){
            for(int j=colstart;j<colend;j++){
               // System.out.print(arr[i][j]+' ');
               if(arr[i][j]!='.'){
                if(myset.contains(arr[i][j])){
                    return false;
                }else{
                    myset.add(arr[i][j]);
                }
            }
            }
          //  System.out.println();
           }
           return true;
           //System.out.println();
    }
    private static boolean sol1(char[][]arr){
        //first - row
        //sub box-1
      boolean b1=  boardBoxChecker(arr, 0, 3, 0, 3);
       //subbox-2
      boolean  b2= boardBoxChecker(arr, 0, 3, 3, 6);
        //subbox-3
      boolean b3=  boardBoxChecker(arr, 0, 3, 6, 9);
      //second row
        //subbox -4
      boolean b4=  boardBoxChecker(arr, 3, 6, 0, 3);
        //subbox- 5
      boolean b5=  boardBoxChecker(arr, 3, 6, 3, 6);
        //subbox- 6
      boolean b6=  boardBoxChecker(arr, 3, 6, 6, 9);
        //third row
        //subbox - 7
      boolean b7=  boardBoxChecker(arr, 6, 9, 0, 3);
        //subbox - 8
      boolean b8=  boardBoxChecker(arr, 6, 9, 3, 6);
        //subbox = 9
       boolean b9= boardBoxChecker(arr, 6, 9, 6, 9);
       boolean isInnerBoxOk=false;
       boolean isAllRowsOk=false;
       boolean isAllColumsOk=false;
       if((b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9 )==true){
        isInnerBoxOk=true;
       }
     //rows 
      boolean row1=rowChecker(arr, 0, 1);
      boolean row2 = rowChecker(arr, 1, 2);
      boolean row3 = rowChecker(arr, 2, 3);
      boolean row4 = rowChecker(arr, 3, 4);
      boolean row5 = rowChecker(arr, 4, 5);
      boolean row6 = rowChecker(arr, 5, 6);
      boolean row7 = rowChecker(arr, 6, 7);
      boolean row8 = rowChecker(arr, 7, 8);
      boolean row9 = rowChecker(arr, 8, 9);
      if((row1 && row2 && row3 && row4 && row5 && row6 && row7 && row8 && row9)==true ){
        isAllRowsOk=true;
      }
      //columns
      boolean col1 =colChecker(arr, 0, 1);
      boolean col2 = colChecker(arr, 1, 2);
      boolean col3 = colChecker(arr, 2, 3);
      boolean col4 = colChecker(arr, 3, 4);
      boolean col5 = colChecker(arr, 4, 5);
      boolean col6 = colChecker(arr, 5, 6);
      boolean col7 = colChecker(arr, 6, 7);
      boolean col8 = colChecker(arr, 7, 8);
      boolean col9 = colChecker(arr, 8, 9);
      if((col1 && col2&& col3&& col4 && col5 && col6&& col7 && col8 && col9 )==true){
        isAllColumsOk=true;
      }
      return (isInnerBoxOk && isAllColumsOk && isAllRowsOk );

    }
    public static void main(String[] args) {
        char[][] board = {
         {'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}
    };

    System.out.println(sol1(board));
    }
}
