package recursion;

public class rateInMaze {
    public static void main(String[] args) {
        int maze[][]  =  {
            {1, 0, 0, 0, 0},
            {1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 1, 1, 1}
        };

        int row  = maze.length;
        int col = maze[0].length;
        int[][] output = new int[maze.length][maze[0].length];

        mazeProblemSolving(maze , output , row ,col ,0 ,0);


    }

    private static void mazeProblemSolving(int[][] maze, int[][] output, int row, int col, int i, int j) {

        if (i >= row || j >= col) {
            return;
        }

        if (i == row - 1 && j == col - 1) {
            output[i][j] = 1;
            for (int a = 0; a < output.length; a++) {
                for (int b = 0; b < output[0].length; b++) {
                    System.out.print(output[a][b] + " ");
                }
                System.out.println();
            }
            return;
        }

            if(maze[i][j]==1){
                output[i][j] = 1;
                mazeProblemSolving(maze ,output, row ,col ,i+1 , j);
                mazeProblemSolving(maze ,output, row ,col ,i , j+1);
            }


    }
}
