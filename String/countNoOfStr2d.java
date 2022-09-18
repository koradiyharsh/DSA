package String;

public class countNoOfStr2d {
    static int howMuchTimeWord = 0;
    public static void main(String[] args) {
        char[][]  ch ={
                {'D','D','D','G','D','D'},
                {'B','B','D','E','B','S'},
                {'B','S','K','E','B','K'},
                {'D','D','D','D','D','E'},
                {'D','D','D','D','D','E'},
                {'D','D','D','D','D','G'}
        };
        boolean[][]  track = new boolean[ch.length][ch[0].length];
        int row = ch.length;
        int col = ch[0].length;
        String str = "GEEKS";
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch[0].length;j++){
                if(ch[i][j]==str.charAt(0)){
                    goThroughTheMatrix(ch , track , i , j ,row ,col , 0 , str.length() , str);
                }
            }
        }
        System.out.println(howMuchTimeWord);
    }

    private static void goThroughTheMatrix(char[][] ch, boolean[][] track, int i, int j, int row, int col ,int idx , int wordLen , String str) {
        if(i < 0 || j < 0 || i>=row || j>=col ||  track[i][j] == true){
            return;
        }
        if(idx==wordLen){
            howMuchTimeWord+=1;
            return;
        }
        if(ch[i][j] == str.charAt(idx) && track[i][j]==false){
            track[i][j] = true;
            idx = idx+1;
        }
        if(i+1>=0 && i+1<row && j>=0 && j< col && track[i][j]==false){
            track[i+1][j] = true;
            goThroughTheMatrix(ch , track , i+1 , j ,row ,col ,idx ,wordLen ,str);
        }
        if(i-1>=0 && i-1 < row && j>=0 && j< col && track[i][j] == false){
            track[i-1][j] = true;
            goThroughTheMatrix(ch , track , i-1 , j ,row ,col ,idx ,wordLen ,str);
        }
        if(i>=0 && i<row && j+1>=0 && j+1 < col && track[i][j] == false){
            track[i][j+1] = true;
            goThroughTheMatrix(ch , track , i , j+1 ,row ,col ,idx ,wordLen ,str);
        }
        if(i>=0 && i < row && j-1 >=0 && j-1 < col && track[i][j] == false){
            track[i][j-1] = true;
            goThroughTheMatrix(ch , track , i , j-1 ,row ,col ,idx ,wordLen ,str);
        }




    }
}
