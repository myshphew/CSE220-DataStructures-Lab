// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task7 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum(BTNode root){
        //TO DO
        int lvl = 0;
        return summation(root,++lvl); //remove this line once ready
    }
    public static Integer summation (BTNode root,int lvl){
        Integer sum = 0;
        if (root!=null){
            sum+= summation(root.left,++lvl) + valueAtCurrentLevel(root,++lvl) + summation(root.right,++lvl);
        } else return 0;
        return sum;
    }
    public static Integer valueAtCurrentLevel (BTNode root, int lvl){
        if (lvl%2==0){
            return (Integer)root.elem;
        } else return -(Integer)root.elem;
    }
    //============================================================================

}
