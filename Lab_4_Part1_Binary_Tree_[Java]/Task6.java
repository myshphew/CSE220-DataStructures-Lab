// Complete the subtractSummation method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation(BTNode root ){
        //TO DO
        return summation(root.left) - summation(root.right); //remove this line once ready
    }

    public static Integer summation (BTNode root){
        Integer sum = 0;
        if (root!=null){
            sum+= summation(root.left) + (Integer)root.elem + summation(root.right);
        } else return 0;
        return sum;
    }
    //============================================================================

}
