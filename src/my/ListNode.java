package my;

public class ListNode {
    private ListNode next = null;
    private int val;
    private int length;

    public ListNode(int val){
        this.val = val;
    }

    public void add(ListNode node){
        this.next = node;
        length++;
    }

    public void removeNext(){
        ListNode nextNext = next.next;
        this.next = nextNext;
        length--;
    }

    public static int next(ListNode node){
        return node.next.val;
    }

    public ListNode reserveList(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode p = null;
        ListNode q = null;
        while (head != null){
            q = head.next;
            head.next = p;
            p = head;
            head = q;
        }
        return p;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode reserveHead = reserveList(slow.next);
        while(head != null && reserveHead != null){
            if(head.val != reserveHead.val)
                return false;
            head = head.next;
            reserveHead = reserveHead.next;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        ListNode cur = this;
        while(cur != null){
            sb.append(cur.val + "->");
            cur = cur.next;
        }
        return sb.toString();
    }

    public int getLength(){
        return length;
    }
}
