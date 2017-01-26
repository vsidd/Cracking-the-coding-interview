package ctc.linkedList;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Siddarthan on 22-Jan-17.
 */
public class c1_RemoveDups {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        ListNode temp = removeDuplicate(node1);
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode removeDuplicate(ListNode root){
        if(root == null || root.next==null){
            return root;
        }
        Set<Integer> nodeVals = new HashSet<>();
        ListNode head = root;
        nodeVals.add(root.val);
        while(root.next != null){
            if(nodeVals.contains(root.next.val)){
                root.next = root.next.next;
            }else {
                nodeVals.add(root.next.val);
                root = root.next;
            }
        }
        return head;
    }
}
