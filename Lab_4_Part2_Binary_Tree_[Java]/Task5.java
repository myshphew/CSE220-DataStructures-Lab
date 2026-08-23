//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum(BSTNode root){
        //TO DO
        return sum(root.left, root.right); // remove this line
    }

    public static Integer sum(BSTNode leftNode, BSTNode rightNode){
        //TO DO
        Integer sum = 0;
        if (leftNode==null || rightNode==null){
            return 0;
        } else {
            sum+=(Integer)leftNode.elem+(Integer)rightNode.elem;
        }
        return sum+sum(leftNode.left,rightNode.right)+sum(leftNode.right,rightNode.left); // remove this line
    }


    
    //===============================================================


}
