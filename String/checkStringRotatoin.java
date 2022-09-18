package String;

public class checkStringRotatoin {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        char c = s1.charAt(0);
        int ptr = 0;
        for (int j = 0; j < s2.length(); j++) {
            if(s2.charAt(j)==c){

                while (ptr < s1.length()-1){
                    j = (j+1)%s2.length();
                    ptr++;
                    if(s1.charAt(j) != s2.charAt(ptr)){
                        break;
                    }
                }
            }
        }
        if(ptr==s1.length()-1){
            System.out.println("no");
        }
    }
}
