package myLinkedList.test;

import myLinkedList.singleLinkedList.SingleLinkedListNode;
import myLinkedList.singleLinkedList.SingleLinkedList;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addAtHead(new SingleLinkedListNode(0,null));
        list.addAtTail(new SingleLinkedListNode(1,null));
        list.addAtIndex(new SingleLinkedListNode(2,null),2);
        System.out.println("size:"+list.getSize());
        list.showList();
        list.updateAtIndex(22, 2);
        list.showList();
        list.deleteAtIndex(2);
        list.showList();
        list.deleteAtIndex(2);


    }
}
