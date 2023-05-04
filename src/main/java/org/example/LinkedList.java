package org.example;


public class LinkedList {
    ListNode<Integer> listNode;
    public LinkedList() {
        listNode = createListNode(new int[]{1, 2, 3, 4, 5, 6, 7});
    }
    public Integer searchByIndex(int index) {
        int i = 0;
        ListNode<Integer> head = listNode;
        return null;
    }

    public ListNode<Integer> searchByValue(int value) {
        ListNode<Integer> head = listNode;
        ListNode<Integer> cur = head;
        while (cur != null) {
            if(cur.value == value) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    public ListNode<Integer> insertNode(int value, int adjacent) {
        ListNode<Integer> p = searchByValue(adjacent);
        ListNode<Integer> n = new ListNode<>(value);
        if(p == null) {
            throw new RuntimeException("Value not found");
        }
        n.next = p.next;
        p.next = n;

        return listNode;
    }

    public ListNode<Integer> deleteNode(int value) {
        ListNode<Integer> prev = listNode;
        ListNode<Integer> cur = prev.next;
        while (cur != null) {
            if(prev.value == value){
                prev = cur;
                return prev;
            } else if(cur.value == value) {
                prev.next = cur.next;
                cur.next = null;
                return listNode;
            }
            prev = prev.next;
            cur = cur.next;
        }
        return null;
    }

    public ListNode<Integer> insertNode(ListNode<Integer> head1, int value, int index) {
        ListNode<Integer> head = listNode;
        ListNode<Integer> prevPtr = head;
        ListNode<Integer> curPtr = prevPtr.next;
        ListNode<Integer> newNode = new ListNode<>(value);

        if (index <= 0) {
            // insert the value to the head
            newNode.next = head;
            // point the newNode as head
            head = newNode;
            return head;
        }
        int i = 1;
        while (i < index && curPtr != null ) {
            prevPtr = curPtr;
            curPtr = curPtr.next;
            i++;
        }
        newNode.next = prevPtr.next;
        prevPtr.next = newNode;
        return head;
    }

//        else if(index >= nodeSize()) {
//            //insert the valued to the end
//            while (cur != null) {
//                prev = prev.next;
//                cur = cur.next;
//
//            }
//            prev.next = newNode;
//            return listNode;
//        } else {
//            while (i != index) {
//                prev = cur;
//                cur = cur.next;
//                i++;
//            }
//            newNode.next = prev.next;
//            prev.next = newNode;
//            return listNode;
//        }
    // 1 -> 2 -> 3 -> 22 -> 4 -> 5 -> 22 -> 6 -> 7 -> 8 -> null
    // 1 -> 2 -> 3 -> 4 -> 5 -> 22 -> 6 -> 7 -> 8 -> null
    // 0    1    2    3
    // prev: 1 while 2   3
    //       1       2   3
    // cur:  2 while 3   4
    public int nodeSize() {
        int cnt = 0;
        ListNode<Integer> cur = listNode;
        while (cur != null) {
            cnt++;
            cur = cur.next;
        }
        return cnt;
    }

    private static ListNode<Integer> createListNode(int[] arr) {
        ListNode<Integer> head = null;
        ListNode<Integer> tail = null;
        for(Integer ar: arr) {
            ListNode<Integer> newNode = new ListNode<>(ar);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        return head;
    }
}
