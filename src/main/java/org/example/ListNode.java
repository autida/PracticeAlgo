package org.example;

public class ListNode<T> {
    T value;
    ListNode<T> next;

    ListNode(T value) {
        this.value = value;
    }
    public String toString() {
        return this.value + " -> " + this.next ;
    }
}
