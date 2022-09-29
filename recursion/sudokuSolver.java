package recursion;

public class sudokuSolver {
    static String[] input = {"1" ,"2" ,"3" ,"4" ,"5" , "6" ,"7" , "8" ,"9"};
    public static void main(String[] args) {

        String board[][] = {{"5", "3", "4", "6", "7", "8", "9", "1", "2"},
                {"6", "7", "2", "1", "9", "5", "3", "4", "8"},
                {"1", "9", "8", "3", "4", "2", "5", "6", "7"},
                {"8", "5", "9", "7", "6", "1", "4", "2", "3"},
                {"4", "2", "6", "8", "5", "3", "7", "9", "1"},
                {"7", "1", "3", "9", "2", "4", "8", "5", "6"},
                {"9", "6", "1", "5", "3", "7", "2", "8", "4"},
                {"2", "8", "7", "4", "1", "9", "6", "3", "5"},
                {"3", "4", "5", "2", "8", ".", ".", "7", "9"}};

        int row =  board.length;
        int col = board[0].length;
        sudokuSolveBy(board);
        for(int k = 0 ; k < row ; k++){
            for(int l = 0; l < col ; l++){
                System.out.print(board[k][l]+" ");
            }
            System.out.println();
        }
    }

    private static boolean sudokuSolveBy(String[][] board) {
        for(int kk = 0; kk < board.length ; kk++){
            for(int ll = 0; ll < board[0].length ; ll++){
                if(board[kk][ll]=="."){
                    for(int pp = 0 ; pp < input.length ; pp++){
                        if(validatePosition(board , kk , ll ,input[pp])){
                            board[kk][ll] = input[pp];
                           boolean aagekeLiyeCallKaro  =  sudokuSolveBy(board);
                           if(aagekeLiyeCallKaro == true){
                               return  true;
                            }else{
                                board[kk][ll] = ".";
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validatePosition(String[][] board, int row ,int col , String expectedValue) {
        for(int ptr=0;ptr < board.length;ptr++){
            if(board[row][ptr] == expectedValue){
                return false;
            }
            if(board[ptr][col] == expectedValue){
                return false;
            }
            if(board[3 *  (row / 3)  + ptr/3][3 * (col /3 ) + ptr % 3] ==expectedValue){
                return false;
            }
        }
        return true;
    }


}
