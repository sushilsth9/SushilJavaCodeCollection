package com.company;

//package com.company;
///*
// * For your reference:
// *
// * SinglyLinkedListNode {
// *     int data;
// *     SinglyLinkedListNode next;
// * }
// *
// */
public class PrintLinkedList {
    public static class SinglyLinkedListNode {
        int val;
        SinglyLinkedListNode next;


        // value represent data

        SinglyLinkedListNode() {
        }

        SinglyLinkedListNode(int val) {
            this.val = val;
        }


        SinglyLinkedListNode(int val, SinglyLinkedListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static void Print(SinglyLinkedListNode head) {
        if (head == null) {
            return;
        }
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null)
            return newNode;

        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

        return head;

    }

    static SinglyLinkedListNode insertNodeAtbegining(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = head;
        head = newNode;
        return head;

    }

    static SinglyLinkedListNode insertNodeAtmiddle(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = head;
        int length = 0;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        //System.out.println(length);
        int i = 0;
        current = head;
        while (i < length / 2) {
            current = current.next;
            i++;
        }
        newNode.next = current.next;
        current.next = newNode;


        return head;


    }

    static SinglyLinkedListNode insertNodeAtspecificposition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = head;
        int length = 0;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        int i = 1;
        current = head;
        while (i < position) {
            current = current.next;
            i++;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;

    }

    static SinglyLinkedListNode insertNodeafter(SinglyLinkedListNode head, int data, int key) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = head;

        while (current.next != null) {
            if (current.val == key)
                break;
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;


        return head;
    }


    static SinglyLinkedListNode DeleteatHead(SinglyLinkedListNode head) {
        head = head.next;
        return head;
    }

    static SinglyLinkedListNode DeleteatEnd(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;

        while (current.next.next != null) {
            current = current.next;

        }
        current.next = null;
        return head;
    }

    static SinglyLinkedListNode DeleteatSecondLast(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current.next.next.next != null) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

    static SinglyLinkedListNode DeleteatMiddle(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;

        int length = 0;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        //System.out.println(length);
        int i = 0;
        current = head;
        //i < length / 2 for even number
        while (i < length / 2 - 1) {
            current = current.next;
            i++;
        }
        current.next = current.next.next;


        return head;
    }

    static SinglyLinkedListNode DeleteAtSpecificPosition(SinglyLinkedListNode head,int Position){
        SinglyLinkedListNode current = head;
        int length = 0;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        int i = 1;
        current = head;
        while (i < Position-1) {
            current = current.next;
            i++;
        }
        current.next=current.next.next;
        return head;
    }

    static SinglyLinkedListNode DeletetheKeynode(SinglyLinkedListNode head,int key){
        SinglyLinkedListNode current = head;

        while (current.next != null) {
            if (current.val == key)
                break;
            current = current.next;
        }
        current.val=current.next.val;
        current.next=current.next.next;
        return head;


    }
    static SinglyLinkedListNode ReverseLinkedList(SinglyLinkedListNode head){
       SinglyLinkedListNode current=head;
       SinglyLinkedListNode previous=null;
       SinglyLinkedListNode after=null;
       while(current!=null){
           after =current.next;
           current.next=previous;
           previous=current;
           current=after;
       }
       head=previous;

    return head;}


    public static void main(String args[]) {
        SinglyLinkedListNode list1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode head = list1;
        list1.next = new SinglyLinkedListNode(2);
        list1.next.next = new SinglyLinkedListNode(3);
        Print(head);

        System.out.println("After the insertion");


        insertNodeAtTail(list1, 4);
        insertNodeAtTail(list1, 5);
        Print(head);

        System.out.println("After inserting at the beginning");


        head = insertNodeAtbegining(head, 6);
        Print(head);
        //head=insertNodeAtbegining(head,8);
        // Print(head);

        System.out.println("Inserting in the middle");

        insertNodeAtmiddle(head, 10);
        Print(head);

        System.out.println("inserting in the specific position");

        insertNodeAtspecificposition(head, 26, 6);
        Print(head);

        System.out.println("inserting after key node");
        insertNodeafter(head, 45, 10);
        Print(head);

        System.out.println("deleting in begining");
        head = DeleteatHead(head);
        Print(head);

        System.out.println("deleting in the end");
        head = DeleteatEnd(head);
        Print(head);

        System.out.println("deletin second last");
        head = DeleteatSecondLast(head);
        Print(head);

        System.out.println("Delere at middle");//delete second middle incase of Even number not in odd number
        head = DeleteatMiddle(head);
        Print(head);

        System.out.println("Deltete at specific position");
        head=DeleteAtSpecificPosition(head,3);
        Print(head);

        System.out.println("Delete the key node");
        head=DeletetheKeynode(head,2);
        Print(head);
        System.out.println("Reverse the linkedlist");
        head=ReverseLinkedList(head);
        Print(head);

    }
}








