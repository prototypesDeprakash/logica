package Dailysum.dailysolved.December;

public class Contest29dec {
    private static void sol1(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]  );    
            }  
            System.out.println();
        }
        System.out.println(arr[0][0]+1);
    }
    public static void main(String[] args) {
        // arr = [[3,2],[1,3],[3,4],[0,1]]
        int[][]arr ={{3,2},{1,3},{3,4},{0,1}};
        sol1(arr);
    }
}

/*
 3->i,j      2 
 1->i,j+1       3
 3       4
 0       1
 
 
 */