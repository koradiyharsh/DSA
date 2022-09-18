package String;

public class printDuplicateValue {
    public static void main(String[] args) {
        String s  ="geeksforgeeks";
        int a = 97;
        int[] table = new int[26];
        for(int i=0;i<s.length();i++){
            int ascii = (int) s.charAt(i);
            table[ascii-a]++;
        }
        for(int j=0;j<s.length();j++){
            if(table[j]>1){
                char c  =  (char) (a + j);
                System.out.println(c+" ");
            }
        }

    }
}
