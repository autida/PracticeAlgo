package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedListPractice linkedListSearch = new LinkedListPractice();
        linkedListSearch.searchByValue(3);
        System.out.println(linkedListSearch.insertNode(9, 2));
        linkedListSearch.insertNode(4, 5);
        System.out.println(linkedListSearch.searchByIndex(1));
        System.out.println(linkedListSearch.deleteNode(1));
    }


}