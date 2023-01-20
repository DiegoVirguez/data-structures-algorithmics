package com.diego.dataStructures.trees;

class BinarySearchTree {
    Node root;

    public BinarySearchTree(int val) {
        root = new Node(val);
    }

    public void insert(int val) {
        insertRecursive(root, val);
    }

    private void insertRecursive(Node current, int val) {
        if (val < current.data) {
            if (current.left == null) {
                current.left = new Node(val);
            } else {
                insertRecursive(current.left, val);
            }
        } else {
            if (current.right == null) {
                current.right = new Node(val);
            } else {
                insertRecursive(current.right, val);
            }
        }
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }


}