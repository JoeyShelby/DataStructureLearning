package linkedList.singleLinkedList;


/**
 * 链表节点
 */
public class SingleLinkedListNode {
    private int data;
    private SingleLinkedListNode next;

    public SingleLinkedListNode(int data, SingleLinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SingleLinkedListNode getNext() {
        return next;
    }

    public void setNext(SingleLinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                ", data=" + data +
                ", next=" + next +
                '}';
    }
}
