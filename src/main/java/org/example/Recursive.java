package org.example;

public class Recursive {
    public static void printIncreasingNumber (int n) {
        if(n > 0) {
            printIncreasingNumber(n - 1); // 1 2 3 4 5
            System.out.println(n);
        }
    }
    public static void printDecreasingNumber (int n) {
        if(n > 0) {
            System.out.println(n);
            printDecreasingNumber(n -1);
        }
    }
    public static int sumOfaRun(int n) {
        if(n < 0) {
            return 0;
        }
        return sumOfaRun(n -1 ) + n;
    }


    /*PROBLEM:
    * Search a linked list for a value. Return true if the value was found.
    *
    * YOU MUST SOLVE THIS RECURSIVELY.
    *
    * Try to find the recursive definition: "Searching a linked list is like
    * doing something with this node, then searching the remainder of the linked list."
    *
    * What's a good base case?
    *
    * EXAMPLES:
    *   head: 1 -> 7 -> 9
    *   value: 2
    *
    *   result: false
    *
    *   head: 1 -> 7 -> 9
    *   value: 9
    *
    *   result: true
    *
    * */

    public static boolean searchValue(ListNode<Integer> head, int value) {
        if(head == null) {
            return false;
        }
        if(head.value == value) {
            return true;
        }
        return searchValue(head.next, value);



    }
}