package my;

public class TestDoubleLinkedList {
    public static void main(String[] args){
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addLast("value1");
        list.addLast("value2");
        list.addLast("value3");
        list.addLast("value4");
        list.addFirst("value0");
        list.insertPre("value3", "插入的节点1");
        list.insertNext("value4", "插入的节点2");
        System.out.println(list.toString());
        list.removeElement("value3");
        System.out.println(list.toString());
        System.out.println("链表长度是：" + list.getLength());
    }
}
