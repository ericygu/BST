package com.company;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Character, Integer> binarySearchTree = new BinarySearchTree<>();
        String test = "EASYQUESTION";
        System.out.println("Height: " + binarySearchTree.height() + " Size: " +
                binarySearchTree.size());
        for(int i = 0 ; i < test.length(); i++){
            binarySearchTree.put(test.charAt(i),test.charAt(i) + 0);
            System.out.println("After put: " + test.charAt(i) + " value: " +(0) +" Height: " + binarySearchTree.height() + " Size: " + binarySearchTree.size());
        }
        binarySearchTree.printbstinorder();
        binarySearchTree.delete('S');
        System.out.println("Delete S, Height: " + binarySearchTree.height() + " Size: " +
                binarySearchTree.size());
        binarySearchTree.printbstinorder();
        binarySearchTree.delete('O');
        System.out.println("Delete O, Height: " + binarySearchTree.height() + " Size: " +
                binarySearchTree.size());
        binarySearchTree.printbstinorder();
    }
}
