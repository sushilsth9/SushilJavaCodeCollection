//package com.company;
//
//public class LinkedList {
//    public static class SinglyLinkedListNode {
//        int val;
//        PrintLinkedList.SinglyLinkedListNode next;
//        // whats the use of this
//        SinglyLinkedListNode() {
//        }
//
//        SinglyLinkedListNode(int val) {
//            this.val = val;
//        }
//
//        SinglyLinkedListNode(int val, PrintLinkedList.SinglyLinkedListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//    }
//    static void sushil(PrintLinkedList.SinglyLinkedListNode head) {
//        if (head == null) {
//            return ;
//        }
//        PrintLinkedList.SinglyLinkedListNode current = head;
//        while (current != null) {
//            System.out.println(current.val);
//            current = current.next;
//        }
//
//    }}
//public static void main(String args[]){
//    PrintLinkedList.SinglyLinkedListNode list1=new PrintLinkedList.SinglyLinkedListNode(1);
//    PrintLinkedList.SinglyLinkedListNode head=list1;
//    list1.next=new PrintLinkedList.SinglyLinkedListNode(2);
//    list1.next.next=new PrintLinkedList.SinglyLinkedListNode(3);
//    sushil(head);