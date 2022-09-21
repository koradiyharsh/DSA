package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    static List<List<String>> master  = new ArrayList<>();
    public static void main(String[] args) {
      //  int n  = 3;
        int k = 3;
        String value  = "123";
        boolean[] track = new boolean[value.length()];
        findTheKthPermutation(k ,value , track , "");
    }

    private static void findTheKthPermutation(int k, String value , boolean[] track , String output) {

        if(master.size()==k) {
            System.out.println(master.get(k-1));
            return;
        }
        if(output.length()==3){
            List<String> sub = new ArrayList<>();
            sub.add(output);
            master.add(sub);
            return;
        }


            for(int i=0;i<value.length();i++){
                if(track[i]==false){
                    track[i] = true;
                    findTheKthPermutation(k , value , track ,output + value.charAt(i));
                    track[i] = false;
                }
            }
    }
}
