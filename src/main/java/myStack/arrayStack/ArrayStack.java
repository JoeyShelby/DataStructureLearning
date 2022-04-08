package myStack.arrayStack;

/**
 * 使用数组实现栈
 */
public class ArrayStack {
    private int maxSize; //栈的最大容量
    private int[] stack;
    private int top = -1; //栈顶，空时为 -1

    /**
     * 构造方法：指定栈的大小
     * @param maxSize
     */
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    /**
     * 判断栈是否已满
     * @return
     */
    public boolean isFull() {
        return top == this.stack.length - 1;
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 入栈
     * @param element
     */
    public void push(int element) {
        if(this.isFull()) {
            System.out.println("当前栈已满！");
        } else {
            this.stack[++this.top] = element;
        }
    }

    /**
     * 出栈
     * @return
     */
    public int pop() {
        if(this.isEmpty()) {
            System.out.println("当前栈为空！");
            return -1;
        }

        return this.stack[this.top--];
    }

    /**
     * 打印栈
     * 栈顶
     * ..
     * ..
     * 栈底
     */
    public void list() {
        if(this.isEmpty()) {
            System.out.println("当前栈为空");
        }

        for(int i = this.top; i >= 0; i--) {
            System.out.println(this.stack[i]);
        }
    }


}
