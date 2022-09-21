package recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueenProblem {
  static   List<List<String>> output=new ArrayList<List<String>>();
    public static void main(String[] args) {
        char[][] queen = new char[4][4];
        for (int j=0;j<queen.length;j++){
            for(int k=0;k<queen[0].length;k++){
                queen[j][k] = '.';
            }
        }
        int row  = queen.length;
        int col =  queen[0].length;
        int i=0;
        int j=0;
        int k=0;
        queencalcualtion(queen , row , col ,k);
        for(List<String> list : output){
            System.out.print(list+" ");
            System.out.println();
        }



    }

    private static void queencalcualtion(char[][] queen, int row, int col, int ptr) {

        if(ptr==col){
            output.add(construct(queen));
            ptr=0;
            return;
        }

        for(int k=0;k<row;k++){
            if(validPositionToPutQueen(k , ptr , row ,col ,queen)){
                if(ptr>=0 && ptr<col) {
                    queen[k][ptr] = 'Q';
                    queencalcualtion(queen, row, col, ptr + 1);
                    queen[k][ptr] = '.';
                }
            }
        }


    }

    private static List<String> construct(char[][] board) {
        List < String > res = new LinkedList< String >();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;

    }

    private static boolean validPositionToPutQueen(int i, int j, int row, int col, char[][] queen) {

        int iptr = i;
        int jptr = j;
        while (iptr>=0 && jptr>=0 && iptr < row && jptr<col){
            if(queen[iptr][jptr]=='Q'){
                return false;
            }
            iptr--;
            jptr--;

        }
        iptr = i;
        jptr = j;
        while (iptr>=0 && jptr>=0 && iptr < row && jptr<col){
            if(queen[iptr][jptr]=='Q'){
                return false;
            }
            iptr++;
            jptr--;

        }
        iptr = i;
        jptr = j;
        while (iptr>=0 && jptr>=0 && iptr < row && jptr<col){
            if(queen[iptr][jptr]=='Q'){
                return false;
            }
            jptr--;

        }
        return true;

    }
}
