package recursion;

public class sudoku {
    static  String input[] = {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9"};
    public static void main(String[] args) {
        String[][] sudoku =  {{"5","3",".",".","7",".",".",".","."},
                             {"6",".",".","1","9","5",".",".","."},
                            {".","9","8",".",".",".",".","6","."},
                            {"8",".",".",".","6",".",".",".","3"},
                            {"4",".",".","8",".","3",".",".","1"},
                            {"7",".",".",".","2",".",".",".","6"},
                            {".","6",".",".",".",".","2","8","."}
                            ,{".",".",".","4","1","9",".",".","5"},
                                {".",".",".",".","8",".",".","7","9"}};


        int row = sudoku.length;
        int col = sudoku[0].length;
        sudokuSolution(sudoku , row ,col , 0 , 0);
    }
    private static void sudokuSolution(String[][] sudoku, int row, int col , int i , int j) {

            if(i==row && col == j){
                for(int r = 0 ; r < row ; r++){
                    for (int c = 0; c < col ; c++){
                        System.out.print(sudoku[r][c]+" ");
                    }
                    System.out.println();
                }
            }
            if(i>=0 && j>=0 && i< row && j < col){
                for(int k=0;k < row ;k++){
                    for(int l =0; l < col ; l++){
                        if(sudoku[k][l]=="."){

                         //   if(validateTheValue(sudoku , row ,col ,k , l))


                        }

                    }
                }
            }
    }
}
