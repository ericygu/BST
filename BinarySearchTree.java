package com.company;

public class BinarySearchTree<Key extends Comparable<Key>,Value> {
    private class Node{
        private Key key;
        private Value val;
        private Node left;
        private Node right;
        private int size;

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }

    private Node root;

    public BinarySearchTree() {}

    public int height() {
        return height(root);
    }

    public int height(Node n) {
        if (n == null) {
            return -1;
        }
        else {
            return (Math.max(height(n.left), height(n.right))) + 1;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node n) {
        if(n == null) {
            return -1;
        }
        else {
            return (Math.max(height(n.left), height(n.right))) + 1);
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void put(Key key, Value val) {
        root = put(root, key, val);
    }

    private Node put(Node n, Key key, Value val) {
        if (n == null) {
            return new Node(key,val, 1);
        }

        int cmp = key.compareTo(n.key);

        if(cmp < 0) {
            n.left = put(n.left, key, val);
        }
        else if(cmp > 0) {
            n.right = put(n.right, key, val);
        }
        else {
            n.val = val;
        }

        n.size = 1 + size(n.left) + size(n.right);
        return n;

    }

    private Node findMin(Node n)
    {
        if(n.right == null) return n;
        return findMin(n.right);
    }

    public void delete (Key key) {
        root = delete(root, key);
    }

    private Node deleteMin(Node n)
    {
        if(n == null)
            return null;

        if(n.right == null)
            return n.left;

        if(n.left!= null)
        {
            Node temp = n;
            n= findMin(temp.left);
            n.left = deleteMin(temp.left);
            n.right = temp.right;
        }
        return n;
    }

    private Node delete(Node n, Key key) {
        if (n == null ) return null;

        int cmp = key.compareTo(n.key);
        if(cmp > 0) {
            n.right = delete(n.right, key);
        }
        else if (cmp < 0) {
            n.left = delete(n.left, key);
        }
        else {
            if(n.left == null)
                return n.right;
            else if(n.right == null)
                return n.left;
            else {
                Node temp = n;
                n= findMin(temp.left);
                n.left = deleteMin(temp.left);
                n.right = temp.right;

            }
        }

        return n;
    }

    private void traversal(Node x) {
        if(x == null) {
            return;
        }
        traversal(x.left);
        System.out.print(x.key + " ");
        traversal(x.right);
    }

    public void printbstinorder() {
        traversal(root);
    }


}








