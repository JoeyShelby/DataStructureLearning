package linkedList.test;

import linkedList.doubleLinkedList.DoubleLinkedList;
import linkedList.doubleLinkedList.DoubleLinkedListNode;

public class TestDoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList list= new DoubleLinkedList();

        list.addAtHead(new DoubleLinkedListNode(null, 1, null));
        list.addAtTail(new DoubleLinkedListNode(null, 2, null));
        list.addAtTail(new DoubleLinkedListNode(null, 3, null));
        list.addAtIndex(new DoubleLinkedListNode(null,9,null),1);
        list.showAll();

        list.delTail();
        list.showAll();
        list.delIndex(0);
        list.showAll();
        System.out.println(list.getSize());
        list.update(0,1);
        list.showAll();
        System.out.println(list.getSize());
        list.update(2,22);
        list.showAll();

        System.out.println(list.showHead());



    }
}
