package ctc.linkedList;

/**
 * Created by Siddarthan on 23-Jan-17.
 */
public class c2_kthToLast {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        ListNode temp = kthToLastElement(node1, 2);
        System.out.println(temp.val);
    }

    public static ListNode kthToLastElement(ListNode root, int k){
        if(root == null || root.next == null)
            return root;

        ListNode ptr1 = root;
        ListNode ptr2 = root;
        int count = k;
        while (count != 0){
            ptr1 = ptr1.next;
            count--;
        }
        ListNode prev = null;
        while (ptr1 != null){
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
            if(ptr1 != null && ptr1.next==null){
                prev = ptr2;
            }
        }
        prev.next = ptr2.next;
        return root;
    }

}
