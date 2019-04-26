package tree;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value){
        this.value = value;
    }

    /**
     * 向子树中添加节点
     * @param node
     */
    public void add(Node node) {
        if (node == null){
            return;
        }
        //判断传入的节点的值比当前子树的根节点的值大还是小
        //添加的节点比当前节点的值更小
        if (node.value < this.value){
            //如果左节点为空
            if (this.left == null){
                this.left = node;
            }else{
                this.left.add(node);
            }
        }else{
            if (this.right == null){
                this.right = node;
            }else{
                this.right.add(node);
            }
        }
    }

    /**
     * 中序遍历
     * @param node
     */
    public void frontShow(Node node) {
        if (node == null){
            return;
        }
        frontShow(node.left);
        System.out.print(node.value + "\t");
        frontShow(node.right);
    }

    /**
     * 查找节点
     * @param value
     */
    public Node search(int value) {
        if (this.value == value){
            return this;
        }else if(value < this.value){
            if (left == null){
                return null;
            }
            return left.search(value);
        }else{
            if (right == null){
                return null;
            }
            return right.search(value);
        }
    }
}
