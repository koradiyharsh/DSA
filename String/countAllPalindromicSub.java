package String;

public class countAllPalindromicSub {
    static int res = 0;
    public static void main(String[] args) {
        String str = "aaaa";
        String input = str;
        String output = "";
        countPalindrone(input , output);
        System.out.println(res);
    }

    private static void countPalindrone(String input, String output) {

        if(input.length()==0){
            if(output.length()>0){
                int start = 0;
                int end = output.length()-1;
                boolean track = true;
                while (start<=end){
                    if(output.charAt(start)!=output.charAt(end)){
                        track =false;
                    }
                    start++;
                    end--;
                }
                if(track){
                 res+=1;
                }
            }

            return;
        }

        countPalindrone(input.substring(1) , output);
        countPalindrone(input.substring(1) , output+input.charAt(0));


    }
}
