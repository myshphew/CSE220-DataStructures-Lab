//Assignment Task (must Submit)
// Complete the rangeSum method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only three parameters
    // first one is the root of the given tree
    // second one the low range and third one is high range
    // You can use extra helper private static methods as per need
    public static Integer rangeSum(BSTNode root, Integer low, Integer high){
        Integer sum = 0;
        if (root!=null){
            if ((Integer)root.elem>=low && (Integer)root.elem<=high){
                sum+=(Integer)root.elem;
            }
            sum+=rangeSum(root.left,low,high)+rangeSum(root.right,low,high);
        } else return 0;
        return sum; // remove this line
    }
    //===============================================================


}
