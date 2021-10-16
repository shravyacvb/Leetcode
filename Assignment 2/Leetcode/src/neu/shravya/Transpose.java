package neu.shravya;

public class Transpose {
    public static int[][] transpose(int[][] matrix) {

        if(matrix == null){
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        if(m == 1 && n ==1){
            return matrix;
        }

        int[][] transposedMatrix = new int[n][m];

        for(int i=0; i < m ; i++){
            for(int j=0; j < n ; j++){
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
}
