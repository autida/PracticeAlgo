package org.example;


public class LinkedList {
    ListNode<Integer> listNode;
    public LinkedList() {
        listNode = createListNode(new int[]{1, 2, 3, 4, 5});
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
