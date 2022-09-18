package String;

public class printallsubsequencce {
    public static void main(String[] args) {
        String str= "ab";
        printAllSubsequence(str , "");
    }

    private static void printAllSubsequence(String input, String output) {
        if(input.length()==0){
            System.out.print(output+" ");
            return;
        }
        printAllSubsequence(input.substring(1) , output);
        printAllSubsequence(input.substring(1) , output+input.charAt(0));
    }
}
