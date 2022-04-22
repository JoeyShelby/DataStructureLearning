package linkedList.singleLinkedList;


//单链表实现
public class SingleLinkedList {
    private int size = 0;
    SingleLinkedListNode head = new SingleLinkedListNode(-1, null);     //头节点

    /**
     * 在链表尾部添加节点
     */
    public void addAtTail(SingleLinkedListNode listNode) {
        SingleLinkedListNode cur = head;

        while(cur.getNext() != null) {
            cur = cur.getNext();
        }
        cur.setNext(listNode);

        this.size++;
    }

    /**
     * 在链表头部添加节点
     */
    public void addAtHead(SingleLinkedListNode listNode) {
        listNode.setNext(head.getNext());
        head.setNext(listNode);
        this.size++;
    }

    /**
     * 按照索引值添加节点
     * 如 index = 3， 则节点应当成为链表的第4个节点
     * 若 index > 链表长度，则放在链表尾部
     * index < 0，则放在链表头部
     */
    public void addAtIndex(SingleLinkedListNode listNode, int index) {
        if(index<0 || index>this.size) throw new RuntimeException("index 不合法");
        SingleLinkedListNode cur = head;
        for (int i = 0; i <index; i++) {
            cur = cur.getNext();
        }
        listNode.setNext(cur.getNext());
        cur.setNext(listNode);

        this.size++;
    }

    /**
     * 更新 index 位置上的节点的 data 域
     * 节点不存在则不更新
     */
    public void updateAtIndex(int data, int index) {
        if(index<0 || index>this.size) throw new RuntimeException("index 不合法");
        SingleLinkedListNode cur = head;
        for (int i = 0; i <=index; i++) {
            cur = cur.getNext();
        }
        cur.setData(data);
    }

    /**
     * 获得链表的长度
     * 只要维护得当，则不需要在获取时进行重新计算
     * 维护得当指的是：添加元素则加一，删除元素则减一
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 删除指定位置上的节点
     * 节点不存在应当报错
     */
    public void deleteAtIndex(int index) {
        if(index<0 || index>=this.size) throw new RuntimeException("index 不合法");
        SingleLinkedListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.getNext();
        }
        cur.setNext(cur.getNext().getNext());

        this.size--;
    }

    /**
     * 打印链表的所有节点
     */
    public void showList() {
        SingleLinkedListNode cur = head;
        while(cur.getNext() != null) {
            cur = cur.getNext();
            System.out.print(cur.getData()+"\t");
        }
        System.out.println("");
    }

}
