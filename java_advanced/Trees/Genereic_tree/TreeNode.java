package java_advanced.Trees.Genereic_tree;

import  java.util.ArrayList;

public class TreeNode<T> {
    T data;
    ArrayList<TreeNode <T>> Childern;

    public  TreeNode(T data)
    {
      this.data = data;
      this.Childern = new ArrayList<>();
    }
}
