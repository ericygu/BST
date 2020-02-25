package com.company;

public class LinkNode{
    LinkNode parent;
    LinkNode leftChild;
    int value;
    LinkNode rightChild;


    LinkNode(){

    }

    LinkNode(int value){
        this.value = value;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }
}