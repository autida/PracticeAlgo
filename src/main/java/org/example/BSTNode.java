package org.example;

public class BSTNode<T> {
    T value;
    BSTNode<T> left;
    BSTNode<T> right;

    public BSTNode(T value) {
        this.value = value;
    }
    public String toString() {
        return this.value + " -> [ " + this.left + ", " + this.right +"]";
    }
}
