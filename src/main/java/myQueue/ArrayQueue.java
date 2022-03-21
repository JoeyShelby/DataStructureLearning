package myQueue;

/**
 * 环形队列的数组实现
 */
public class ArrayQueue {
    private int maxSize;  //maxSize 不得为0
    private int front;  //指向队列的头元素
    private int rear;   //指向队列的尾元素的下一位
    private int[] array;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
    }

    /**
     * 判断队列是否为空
     */
    public boolean isEmpty() {
        return this.front == this.rear;  //front 追上 rear，则队列空
    }

    /**
     * 判断队列满
     */
    public boolean isFull() {
        return (this.rear+1) % maxSize == this.front; //rear 倒追上 front，队列满
    }


    /**
     * 添加元素
     * 只能加在队列末尾
     * @param element
     */
    public void add(int element) {
        if(this.isFull()) {
            System.out.println("很抱歉，队列已满！");
        } else {
            array[rear] = element;
            rear = (rear+1) % maxSize;
            System.out.println("添加完成");
        }
    }
    /**
     * 获取元素
     * 只能从队列头出队
     */
    public void get() {
        if(this.isEmpty()) {
            System.out.println("很抱歉，队列中没有元素！");
        } else {
            int tmp = array[front];
            front = (front+1) % maxSize;
            System.out.println("已取出队列首元素：" + tmp);
        }
    }

    /**
     * 打印所有元素
     */
    public void showAll() {
        if(this.isEmpty()) {   //rear == front
            System.out.println("当前队列为空");
        } else {
            if(front < rear){   //front < rear
                for (int i = front; i < rear; i++) {
                    System.out.println(array[i]);
                }
            } else {              //front > rear
                for (int i = front; i < maxSize; i++) {
                    System.out.println(array[i]);
                }
                for (int i = 0; i < rear; i++) {
                    System.out.println(array[i]);
                }
            }
        }
    }
    /**
     * 有效元素个数
     * @return
     */
    public int count() {
        return (rear+maxSize-front) % maxSize;
    }

    /**
     *  返回队列的首元素
     */
    public int theFirst() {
        if(this.isEmpty()) {
            throw new RuntimeException("当前队列为为空");
        }
        return array[front];
    }
}
