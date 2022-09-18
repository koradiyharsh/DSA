package String;

import java.util.HashMap;
import java.util.Map;

public class convertRoman {
    public static void main(String[] args) {
        String str = "IX";
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        int sum = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            String s = Character.toString(c);
            sum += map.get(s);
            if (c == 'I') {
                if (i + 1 < str.length()) {
                    if (str.charAt(i + 1) == 'X' || str.charAt(i + 1) == 'V') {
                        sum -= 2;
                    }
                }

            } else if (c == 'X') {
                if (i + 1 < str.length()) {
                    if (str.charAt(i + 1) == 'L' || str.charAt(i + 1) == 'C') {
                        sum -= 20;
                    }
                }

            } else if (c == 'C') {
                if (i + 1 < str.length()) {
                    if (str.charAt(i + 1) == 'D' || str.charAt(i + 1) == 'M') {
                        sum -= 200;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
