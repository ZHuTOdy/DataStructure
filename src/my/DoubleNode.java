package my;

public class DoubleNode {
    //上一个节点
    private DoubleNode pre = this;
    //下一个节点
    private DoubleNode next = this;
    //节点数据
    private int data;

    public DoubleNode(int data){
        this.data = data;
    }
    //增加节点
    public void after(DoubleNode node){
        //原来的下一个节点
        DoubleNode nextNext = next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //把当前节点作为新节点的前一个节点
        node.pre = this;
        //让原来的下一个节点作新节点的下一个节点
        node.next = nextNext;
        //让原来的下一个节点的上一个节点作为新节点
        nextNext.pre = node;
    }

    public void remove(DoubleNode node){
        DoubleNode preNode = node.pre;
        DoubleNode nextNode = node.next;

        preNode.next = nextNode;
        nextNode.pre = preNode;
    }

    //下一个节点
    public DoubleNode next(){
        return this.next;
    }

    public DoubleNode pre(){
        return this.pre;
    }

    //获取数据
    public int getData(){
        return this.data;
    }
}
