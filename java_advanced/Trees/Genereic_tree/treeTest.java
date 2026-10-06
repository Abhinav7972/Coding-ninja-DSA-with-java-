//package java_advanced.Trees.Genereic_tree;


public class treeTest {

    public  static  void printTree(TreeNode<Integer> root)
    {  
        //special case not a base case 
       if (root == null) {
         return ;
       }

       System.out.print(root.data + "  :");

       
       for(int i = 0; i<root.Childern.size();i++)
       {
         System.out.print(root.Childern.get(i).data);
       }
       System.out.println();
       for(int i = 0; i<root.Childern.size();i++)
       {
          TreeNode<Integer> child = root.Childern.get(i);
          printTree(child);
       }

    }

   
    public static int numberOfNodes(TreeNode<Integer> root)
    {
     int count = 1;

     for(int i = 0;i<root.Childern.size();i++)
     {
       int childCount = numberOfNodes(root.Childern.get(i));
       count+=childCount;
     }

    return  count;
    }


    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(4);
        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
        TreeNode<Integer> node3 = new TreeNode<Integer>(1);
        TreeNode<Integer> node4 = new TreeNode<Integer>(5);
        TreeNode<Integer> node5 = new TreeNode<Integer>(6);


       root.Childern.add(node1);
       root.Childern.add(node2);
       root.Childern.add(node3);

       node2.Childern.add(node4);
       node2.Childern.add(node5);


       printTree(root);
       System.out.println();
       System.out.println(numberOfNodes(root));
    }
}
