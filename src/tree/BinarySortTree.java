package tree;

public class BinarySortTree {
    private Node root;

    /**
     * 向二叉排序树中添加节点
     * @param node
     */
    public void add(Node node){
        //如果是一颗空树
        if (root == null){
            root = node;
        }else{
            root.add(node);
        }
    }

    /**
     * 中序遍历二叉排序树，从小到大的顺序
     */
    public void frontShow(){
        if (root != null){
            root.frontShow(root);
        }
        System.out.println();
    }

    public Node search(int value){
        if (root == null)
            return null;
        else{
            return root.search(value);
        }
    }
}
