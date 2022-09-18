package String;

public class editDistance {
    public static void main(String[] args) {
        String str1 = "sunday";
        String str2 = "saturday";

        int m =  str1.length();
        int n = str2.length();


        if(str1.length()==0){
            System.out.println(n);
        }
        if(str2.length()==0){
            System.out.println(n);
        }
        int result = editDistnace(str1 ,str2 ,m ,n);
        System.out.println(result);
    }

    private static int editDistnace(String str1, String str2, int m, int n) {
        if(m == 0){
            return n;
        }
        if(n == 0){
            return m;
        }
        if(str1.charAt(m-1) == str2.charAt(n-1)){
            return editDistnace(str1 ,str2 ,m-1,n-1);
        }

        int insert = 1+editDistnace(str1 ,str2 , m , n-1);
        int remove = 1+editDistnace(str1 ,str2 ,m-1 ,n);
        int replace = 1+editDistnace(str1 ,str2 ,m-1 ,n-1);
        return Math.min(insert , Integer.min(remove , replace));

    }
}
