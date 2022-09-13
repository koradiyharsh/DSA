package Array;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 2}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    makingZero(matrix, i, j, row, col);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j] ==-1){
                    matrix[i][j]=0;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void makingZero(int[][] matrix, int i, int j, int row, int col) {
        for (int a = j; a < col; a++) {
            if (matrix[i][a] != 0) {
                matrix[i][a] = -1;
            }
        }
        for (int a = j; a >= 0; a--) {
            if (matrix[i][a] != 0) {
                matrix[i][a] = -1;
            }
        }
        for (int a = i; a < row; a++) {
            if (matrix[a][j] != 0) {
                matrix[a][j] = -1;
            }
        }
        for (int a = i; a >= col; a--) {
            if (matrix[a][j] != 0) {
                matrix[a][j] = -1;
            }
        }

    }
}
