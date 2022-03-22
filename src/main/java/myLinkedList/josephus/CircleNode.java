package myLinkedList.josephus;

/**
 * 环的节点
 */
public class CircleNode {
    private int data;
    private CircleNode next;

    public CircleNode(int data, CircleNode next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CircleNode getNext() {
        return next;
    }

    public void setNext(CircleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "CircleNode{" +
                "data=" + data +
                '}';
    }
}
