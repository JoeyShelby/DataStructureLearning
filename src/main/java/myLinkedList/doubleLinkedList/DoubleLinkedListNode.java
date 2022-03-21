package myLinkedList.doubleLinkedList;


/**
 * 双向链表的节点
 */
public class DoubleLinkedListNode {
    private DoubleLinkedListNode pre;
    private int date;
    private DoubleLinkedListNode next;

    public DoubleLinkedListNode(DoubleLinkedListNode pre, int date, DoubleLinkedListNode next) {
        this.pre = pre;
        this.date = date;
        this.next = next;
    }

    public DoubleLinkedListNode getPre() {
        return pre;
    }
    public void setPre(DoubleLinkedListNode pre) {
        this.pre = pre;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public DoubleLinkedListNode getNext() {
        return next;
    }
    public void setNext(DoubleLinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DoubleLinkedListNode{" +
                "date= " + date +
                '}';
    }
}
