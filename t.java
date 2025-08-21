class t{
   static class node{
        int val;
        node left,right;
        node (int val){
            this.val=val;
            left=right=null;
        }
    }
   public static boolean ischeck(node t1,node t2){
        if(t1==null && t2==null){
            return true;
        }
        if(t1==null || t2==null)
        {
            return false;
        }
        return (t1.val==t2.val)&&
            ischeck(t1.left, t2.left)&&
            ischeck(t1.right, t2.right);
   }
   public static void main(String[] args) {
    
     node tree=new node(1);
     tree.left=new node(2);
     tree.right=new node(2);

     node tree2=new node(1);
     tree2.left=new node(2);
     tree2.right=new node(3);
     
     if(ischeck(tree, tree2)){
        System.out.print("BinaryTree t1 and t2 are same!");
     }
     else{
        System.out.print("BinaryTree t1 and t2 are not same!");
     }
   }
}