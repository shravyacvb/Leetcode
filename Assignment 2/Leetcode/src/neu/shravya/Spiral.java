package neu.shravya;

import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> spiralList = new ArrayList<>();

        if(matrix.length == 0){
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int rStart = 0, rEnd = m - 1;
        int cStart = 0, cEnd = n - 1;

        while(spiralList.size() < m * n)
        {
            for(int j = cStart; j <= cEnd; j++){
                spiralList.add(matrix[rStart][j]);
            }
            rStart++;

            for(int i = rStart; i <= rEnd; i++){
                spiralList.add(matrix[i][cEnd]);
            }
            cEnd--;

            if(spiralList.size() < m * n){
                for(int j = cEnd; j >= cStart; j--){
                    spiralList.add(matrix[rEnd][j]);
                }
                rEnd--;

                for(int i = rEnd; i >= rStart; i--){
                    spiralList.add(matrix[i][cStart]);
                }
                cStart++;
            }
        }
        return spiralList;
    }
}
