import java.util.ArrayList;

public class spiralmatrix3 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        ArrayList res= new ArrayList<>();

        while (left<=right && top<=bottom) {
                for(int i=left;i<=right;i++){
                    res.add(matrix[top][i]);

                }
                top++;
                for(int i =top;i<=bottom;i++){
                    res.add(matrix[i][right]);
                    
                }
                right--;
                if(top<=bottom){
                    for(int i=right;i>=left;i--){
                        res.add(matrix[bottom][i]);
                    }
                }
                bottom--;

                if(left<=right){
                    for(int i=bottom ;i>=top;i--){
                        res.add(matrix[i][left]);
                    }
                }
                left+=1;
                
        }

        System.out.println(res);


    }
}
