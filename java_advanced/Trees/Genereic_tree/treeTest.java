package java_advanced.Trees.Genereic_tree;


public class treeTest {
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
    }
}
