package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MobileKeypad {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("ABC" ,2);
        map.put("DEF" ,3);
        map.put("GHI" ,4);
        map.put("JKL" ,5);
        map.put("MNO" ,6);
        map.put("PQRS" ,7);
        map.put("TUV" ,8);
        map.put("WXYZ" ,9);

        String str = "GEEKSFORGEEKS";
        MobileKeyboardPrint(map ,str);

    }

    private static void MobileKeyboardPrint(Map<String, Integer> map, String str) {
        List<String> list =new ArrayList<>();
        for(int j=0; j< str.length() ;j++){
            char c =  str.charAt(j);

        }
    }
}
