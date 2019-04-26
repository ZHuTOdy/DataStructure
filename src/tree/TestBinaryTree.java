package tree;

public class TestBinaryTree {
    public static void main(String[] args){
        BinaryTree binTree = new BinaryTree();

        TreeNode root = new TreeNode(1);

        binTree.setRoot(root);

        //创建两个节点
        TreeNode rootR = new TreeNode(3);
        //把新创建的节点设置为根节点的子节点
        TreeNode rootL = new TreeNode(2);

        root.setlNode(rootL);
        root.setrNode(rootR);
        rootL.setlNode(new TreeNode(4));
        TreeNode fiveNode = new TreeNode(5);
        rootL.setrNode(fiveNode);
        rootR.setlNode(new TreeNode(6));
        rootR.setrNode(new TreeNode(7));
        binTree.frontShow();
        System.out.println();
        binTree.minShow();
        System.out.println();
        binTree.afterTree();
        System.out.println();
        System.out.println(binTree.getRoot());
        System.out.println(binTree.frontSearch(1) == root);

//        binTree.delete(1);
//        binTree.minShow();

        binTree.threadNode();
        //获取5节点的后继节点
        binTree.threadIterate();
    }
}
