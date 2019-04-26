package my;

public class TestListNode {
    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(1);

        n1.add(n2);
        n2.add(n3);
        n3.add(n4);
        n4.add(n5);
        System.out.println(ListNode.next(n1));
        System.out.println(n1.isPalindrome(n1));
    }
}
