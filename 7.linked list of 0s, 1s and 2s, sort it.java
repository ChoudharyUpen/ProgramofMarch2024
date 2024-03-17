Given a linked list of 0s, 1s and 2s, sort it -------------
(Learned from chat gpt  need to do it 3-4 times algorithm used is dutch national flag algorithm)

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DutchNationalFlagLinkedList {
    public static ListNode DNFA(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode zeroDummy = new ListNode(0);
        ListNode oneDummy = new ListNode(0);
        ListNode twoDummy = new ListNode(0);

        ListNode zeroTail = zeroDummy;
        ListNode oneTail = oneDummy;
        ListNode twoTail = twoDummy;

        ListNode curr = head;

        while (curr != null) {
            if (curr.val == 0) {
                zeroTail.next = curr;
                zeroTail = zeroTail.next;
            } else if (curr.val == 1) {
                oneTail.next = curr;
                oneTail = oneTail.next;
            } else {
                twoTail.next = curr;
                twoTail = twoTail.next;
            }
            curr = curr.next;
        }

        zeroTail.next = oneDummy.next != null ? oneDummy.next : twoDummy.next;
        oneTail.next = twoDummy.next;

        twoTail.next = null; // This is to avoid cycle in linked list

        return zeroDummy.next;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(0);

        System.out.println("Original List:");
        printList(head);

        head = DNFA(head);

        System.out.println("Sorted List:");
        printList(head);
    }
}

