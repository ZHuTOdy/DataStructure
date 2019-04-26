package my;


public class DoubleLinkedList<E> {
    private Node first;
    private Node last;
    private int length = 0;
    class Node{
        private Node pre;
        private Node next;
        private E e;

        private Node(Node pre, Node next, E e){
            this.pre = pre;
            this.next = next;
            this.e = e;
        }
    }
    /**
     * 向头节点添加元素，节点结构对外应该是不可见的，所以这里只传递一个泛型的值e
     */
    public void addFirst(E e){
        if (first == null){
            Node node = new Node(null, null, e);
            this.first = node;
            this.last = node;
            length++;
        }else{
            Node node = new Node(null, first, e);
            this.first.pre = node;
            this.first = node;
            length++;
        }
    }

    /**
     * addLast同addFirst
     */
    public void addLast(E e){
        if (last == null){
            Node node = new Node(null, null, e);
            this.first = node;
            this.last = node;
            length++;
        }else{
            Node node = new Node(last, null, e);
            this.last.next = node;
            this.last = node;
            length++;
        }
    }

    public void insertPre(E baseElement, E value){
        Node index = this.first;
        while(index != null){
            if (index.e == baseElement)
                break;
            index = index.next;
        }
        Node insertValue = new Node(index.pre, index, value);
        index.pre.next = insertValue;
        index.pre = insertValue;
        length++;
    }

    public void insertNext(E baseElement, E value){
        Node index = this.first;
        while(index != null){
            if (index.e == baseElement)
                break;
            index = index.next;
        }
        Node inserValue = new Node(index, index.next, value);
        index.next = inserValue;
        index.next.pre = inserValue;
        length++;
    }

    public void removeElement(E value){
        Node index = this.first;
        while(index != null){
            if (index.e == value)
                break;
            index = index.next;
        }
        index.pre.next = index.next;
        index.next.pre = index.pre;
        length--;
    }

    public int getLength(){
        return length;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer  = new StringBuffer();
        Node current = this.first;
        while (current != null){
            stringBuffer.append(current.e + "->");
            current = current.next;
        }
        return stringBuffer.toString();
    }
}
