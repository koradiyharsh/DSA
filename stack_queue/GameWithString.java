package stack_queue;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GameWithString {
    public static void main(String[] args) {
        String s = "aabcbcbcabcc";
        int k =3;
        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0; i<s.length(); i++){

            char c=s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }

        for(int i=0; i<k; i++){
            int max = (Collections.max(hm.values()));
            for(char c: hm.keySet()){
                if(hm.get(c)==max){
                    hm.put(c,hm.get(c)-1);
                    break;
                }
            }
        }
        int sum=0;
        for(int x:hm.values()){
            sum+=x*x;
        }
        System.out.println(sum);
    }
}
