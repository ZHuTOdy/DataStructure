package tree;

public class BinaryTree {

    private TreeNode root;
    //用于临时存储前驱节点
    private TreeNode pre = null;

    public void setRoot(TreeNode root){
        this.root = root;
    }

    /**
     * 中序线索二叉树
     * @param node
     */
    public void threadNodes(TreeNode node){
        //当前节点如果为null，直接返回
        if (node == null){
            return;
        }
        //处理左子树
         threadNodes(node.lNode);
        //处理前驱节点
        if (node.lNode == null){
            //让当前节点的左指针指向前驱节点
            node.lNode = pre;
            //改变当前节点左指针的类型
            node.leftType = 1;
        }
        //处理前驱节点的右指针，如果前驱节点的右指针是null（没有指向右子树
        if (pre != null && pre.rNode == null ){
            //让前驱节点的右指针指向当前节点
            pre.rNode = node;
            //改变前驱节点的右指针类型
            pre.rightType = 1;
        }
        //每处理一个节点，当前节点是下一个节点的前驱节点
        pre = node;
         //处理右子树
        threadNodes(node.rNode);
    }

    /**
     * 遍历线索二叉树
     */
    public void threadIterate(){
        //用于临时存储当前遍历节点
        TreeNode node = root;
        while(node != null){
            //循环找到最开始的节点
            while (node.leftType == 0) {
                node = node.lNode;
            }
            //打印当前节点的值
            System.out.print(node.value+"\t");
            //如果当前的节点的右指针指向的是后继结点，可能后继结点还有后继结点
            while(node.rightType == 1){
                node = node.rNode;
                System.out.print(node.value+"\t");
            }
            //替换遍历的节点
            node = node.rNode;
        }
    }

    public void threadNode(){
        threadNodes(root);
    }

    public int getRoot(){
        return root.value;
    }
    public void frontShow(){
        if (root != null)
            root.frontShow();

    }

    public void minShow(){
        if (root != null)
            root.midShow();
    }

    public void afterTree(){
        if (root != null)
            root.afterShow();
    }

    public TreeNode frontSearch(int i){
        return root.frnotSearch(i);
    }

    public void delete(int i){
        if (root.value == i)
            root = null;
        else
            root.delete(i);
    }
}
