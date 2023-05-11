package org.example;

public class BinaryTreeOperation {

    BSTNode<Integer> root;

    public BinaryTreeOperation() {
        root = new BSTNode<>(5);
    }

    public BSTNode<Integer> insertNode(int[] values) {
        /*
        declare and initialize a binary tree node cur with the value of the first array element
        if cur value is greater than the root value,
            if root.right equals null
                set root.right equals cur
            else
                set root = right
        if cur value is greater than the root value,
             if root.right equals null
                set root.right equals cur
            else
                set root = right
        else
             if root.left equals null
                set root.left equals cur
            else
                set root = left
        if cur value is greater than the root value,
             if root.right equals null
                set root.right equals cur
            else
                set root = right
        */
        for(int v: values) {
          BSTNode<Integer> newNode = new BSTNode<>(v);
          BSTNode<Integer> curNode = root;
          BSTNode<Integer> parentNode = null;
          if(root == null) {
              root = newNode;
              return root;
          }
          while (true) {
              parentNode = curNode;
              if(v < curNode.value) {
                  curNode = curNode.left;
                  if(curNode == null) {
                      parentNode.left = newNode;
                      break;
                  }
              } else if(v > curNode.value) {
                  curNode = curNode.right;
                  if(curNode == null) {
                      parentNode.right = newNode;
                      break;
                  }
              } else {
                  break;
              }
          }
      }
        return root;
    }
    public boolean searchNode(BSTNode<Integer> parentNode, int v) {
        BSTNode<Integer> curNode = parentNode;
        if(curNode == null) {
            return false;
        }
        if(curNode.value == v) {
            return true;
        }
        if(v > curNode.value) {
            return searchNode(curNode.right, v);
        } else if(v < curNode.value) {
            return searchNode(curNode.left, v);
        }
        return false;
    }

}
