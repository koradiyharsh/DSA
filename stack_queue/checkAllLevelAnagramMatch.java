package stack_queue;


public class checkAllLevelAnagramMatch {

    static class BST
    {
        BST left;
        BST right;
        int val;
        BST(int val){
            this.val = val;
            this.left = null;
            this.right = null;

        }
    }
    public static void main(String[] args) {

        BST bst = new BST(1);
        bst.left  = new BST(3);
        bst.right = new BST(2);
        bst.right.left = new BST(5);
        bst.right.right = new BST(4);

        BST bst2 = new BST(1);
        bst2.left  = new BST(2);
        bst2.left.left = new BST(4);
        bst2.left.right = new BST(5);
        bst2.right = new BST(3);

        if(anagramOfNot(bst ,bst2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }

    private static boolean anagramOfNot(BST bst, BST bst2) {

        if(bst==null && bst2 == null){
            return true;
        }
        if(bst==null && bst2!=null){
            return false;
        }
        if(bst!=null && bst2==null){
            return false;
        }
        if(bst.val != bst2.val){
            return false;
        }

        return anagramOfNot(bst.left ,bst2.right) && anagramOfNot(bst.right ,bst2.left);

    }
}
