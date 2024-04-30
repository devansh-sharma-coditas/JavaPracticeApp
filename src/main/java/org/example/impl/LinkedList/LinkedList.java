package org.example.impl.LinkedList;

import java.util.List;

class Node{
    int data ;
    Node next ;

    public Node(int number) {
        this.data = number;
        this.next = null;
    }
}
public class LinkedList {
    Node head ;

    public void add(int data) {
        if(head == null){
            head = new Node(data);
        }
        else{
            Node curNode = head ;
            while(curNode.next !=null){
                curNode = curNode.next;
            }

            // reached to end node
            Node newNode = new Node(data);
            curNode.next = newNode;
        }
    }

    public void printList(Node head) {
        if(head !=null){
            Node curNode = head ;
            while(curNode != null){
                System.out.print(  curNode.data + "-->");
                curNode = curNode.next ;
            }
        }
        else {
            System.out.println("Nothing to print in list");
        }
    }

    /**
     * 10-->20-->30-->
     * null<--10<--20<--30 head
     *
     */
    public Node reverse(Node head) {
        if(head == null || head.next == null) {
            System.out.println("NOTHING TO REVERSE : ");
            return head ;
        }

        Node prev = null;
        Node cur = head ;
        Node temp = null;

        while(cur != null){
            temp = cur.next ;
            cur.next = prev;

            prev = cur ;
            cur = temp;

        }
        return prev;
    }

    /**
     *  this is method for reversing linkedlist using recursion
     */
    Node reverseUsingRecursion(Node head){

        return null;
    }

}
class Runner{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(310);
        linkedList.add(302);
        linkedList.add(303);

        linkedList.printList(linkedList.head);
//        Node reverse = linkedList.reverse(linkedList.head);
//
//        System.out.println();
//        linkedList.printList(reverse);
//        linkedList.delete();

        Node node = linkedList.reverseUsingRecursion(linkedList.head);


    }
}