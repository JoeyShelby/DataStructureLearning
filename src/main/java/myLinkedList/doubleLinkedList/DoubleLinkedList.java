package myLinkedList.doubleLinkedList;

/**
 * 双向链表
 */
public class DoubleLinkedList {
    private int size = 0;
    //虚拟头节点
    DoubleLinkedListNode head = new DoubleLinkedListNode(null,-1,null);

    /**
     * 在链表首部插入节点
     * @param node
     */
    public void addAtHead(DoubleLinkedListNode node) {
        if(head.getNext() != null){
            head.getNext().setNext(node);
        }

        node.setNext(head.getNext());
        head.setNext(node);
        node.setPre(head);

        size++;
    }

    /**
     * 在链表尾部插入节点
     * @param node
     */
    public void addAtTail(DoubleLinkedListNode node) {
        DoubleLinkedListNode tmp = head;
        while(tmp.getNext() != null){
            tmp = tmp.getNext();
        }

        node.setPre(tmp);
        tmp.setNext(node);

        size++;
    }

    /**
     * 在 index 处插入节点
     *  若 index < 0, 插入头节点
     *  若 index >= size, 插入尾结点
     * @param node
     */
    public void addAtIndex(DoubleLinkedListNode node, int index) {
        if(index < 0) this.addAtHead(node);
        else if(index >= size) this.addAtTail(node);
        else {
            DoubleLinkedListNode cur = head;
            for (int i = 0; i <= index; i++) {
                cur = cur.getNext();
            }

            cur.getNext().setPre(node);
            node.setNext(cur.getNext());
            cur.setNext(node);
            node.setPre(cur);

            size++;
        }

    }

    /**
     * 删除尾部元素
     */
    public void delTail() {
        if(size <=0 ) System.out.println("当前链表为空");
        else{
            DoubleLinkedListNode cur = head;
            while(cur.getNext() != null){
                cur = cur.getNext();
            }

            cur.getPre().setNext(cur.getNext());
            cur.setPre(null);

            size--;
        }

    }

    /**
     * 删除指定位置元素
     * 若 index <0 或 index >= size , 报错
     * @param index
     */
    public void delIndex(int index) {
        if(index <0 || index >= size) {
            System.out.println("index 不合法！");
        } else {
            DoubleLinkedListNode cur = head;
            for (int i = 0; i <= index; i++) {
                cur = cur.getNext();
            }

            cur.getNext().setPre(cur.getPre());
            cur.getPre().setNext(cur.getNext());

            size--;
        }

    }

    /**
     * 根据 data 的值更新 data
     * @param oldData
     * @param newDate
     */
    public void update(int oldData, int newDate) {
        DoubleLinkedListNode cur = head;
        while(cur.getNext() != null){
            cur = cur.getNext();
            if(cur.getDate() == oldData){
                cur.setDate(newDate);
                return;
            }
        }
        System.out.println("无匹配元素");
    }

    /**
     * 返回头节点，不存在则返回 null
     */
    public DoubleLinkedListNode showHead() {
        return head.getNext();
    }


    /**
     * 按照 index，查询返回指定节点
     * 对 index 进行合法判断
     * @param index
     * @return
     */
    public DoubleLinkedListNode showIndex(int index){
        if (index < 0 || index >= size) {
            System.out.println("index 不合法");
        } else {
            DoubleLinkedListNode cur = head;
            for (int i = 0; i <= index; i++) {
                cur = cur.getNext();
            }
            return cur;
        }

        return null;
    }

    /**
     * 打印全部节点
     * @return
     */
    public void showAll(){
        DoubleLinkedListNode cur = head;
        while(cur.getNext() != null){
            cur = cur.getNext();
            System.out.print(cur+"\t");
        }
        System.out.println("");

    }

    public int getSize() {
        return size;
    }
}
