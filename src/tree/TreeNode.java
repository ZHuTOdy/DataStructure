package tree;

public class TreeNode {
    //节点的权
    int value;
    //左儿子
    TreeNode lNode;
    //右儿子
    TreeNode rNode;
    //标识左指针类型
    int leftType;
    int rightType;

    public TreeNode(int value){
        this.value = value;
    }

    //设置左儿子
    public void setlNode(TreeNode lNode){
        this.lNode = lNode;
    }

    //设置右儿子
    public void setrNode(TreeNode rNode){
        this.rNode = rNode;
    }

    //前序遍历
    public void frontShow(){
        System.out.print(value+"\t");
        if (lNode != null){
            lNode.frontShow();
        }
        if (rNode != null){
            rNode.frontShow();
        }
    }

    //中序遍历
    public void midShow(){
        if (lNode != null)
            lNode.midShow();
        System.out.print(value+"\t");
        if (rNode != null)
            rNode.midShow();
    }

    //后序遍历
    public void afterShow(){
        if (lNode != null)
            lNode.afterShow();
        if (rNode != null)
            rNode.afterShow();
        System.out.print(value+"\t");
    }

    public TreeNode frnotSearch(int i ){
        TreeNode target = null;
        if (this.value == i){
            return this;
        }else{
            if (lNode != null){
                target = lNode.frnotSearch(i);
            }
            if (target != null){
                return target;
            }
            if (rNode != null){
                target = rNode.frnotSearch(i);
            }
        }
        return target;
    }

    public void delete(int i){
        TreeNode parent = this;
        //判断左儿子
        if (parent.lNode != null && parent.lNode.value == i){
            parent.lNode = null;
            return;
        }
        //判断右儿子
        if (parent.rNode != null && parent.rNode.value == i){
            parent.rNode = null;
            return;
        }
        //递归检查并删除左儿子
        parent = parent.lNode;
        if (parent != null){
            parent.delete(i);
        }
        //递归检查并删除右儿子
        parent = parent.rNode;
        if (parent != null){
            parent.delete(i);
        }
    }
}
