//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST(BSTNode root){
        //TO DO
        if (root==null){
            return true;
        }
        Integer valueOfRoot = (Integer)root.elem;
        Boolean flagLeft = true;
        if (root.left!=null){
            if(!((Integer)root.left.elem<valueOfRoot)){
                flagLeft = false;
            }
        }
        Boolean flagRight = true;
        if (root.right!=null){
            if(!((Integer)root.right.elem>valueOfRoot)){
                flagRight = false;
            }
        }
        return flagLeft&&flagRight&&isBST(root.left)&&isBST(root.right); // remove this line
    }
    // public static boolean checkLeftNode(BSTNode leftNode,Integer valueOfRoot){
    //     if (leftNode==null){
    //         return true;
    //     }
    //     if ((Integer)leftNode.elem<valueOfRoot){
    //         return true||isBST(leftNode);
    //     }
    //     else return true;
    // }
    // public static boolean checkRightNode(BSTNode rightNode,Integer valueOfRoot){
    //     if (rightNode==null){
    //         return true;
    //     }
    //     if ((Integer)rightNode.elem<valueOfRoot){
    //         return true||isBST(rightNode);
    //     }
    //     else return true;
    // }
    // public static boolean check(BSTNode root){
    //     boolean flag = false;
    //     if (root==null){
    //         return true;
    //     }
        
    //     if (root.left!=null){
    //         if ((Integer)root.left.elem<(Integer)root.elem){
    //             flag = true;
    //         }
    //         flag = check(root.left);
    //     } else if (root.right!=null){
    //         if ((Integer)root.right.elem>(Integer)root.elem){
    //             flag = true;
    //         }
    //         flag = check(root.right);
    //     }
        
    //     return flag;
    
    // }
    //===============================================================


}
