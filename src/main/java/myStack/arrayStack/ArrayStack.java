package myStack.arrayStack;

import java.util.ArrayList;
import java.util.List;

//栈
public class ArrayStack <T>{
    private int maxSize; //栈的最大容量
    private List<T> stack;
    private int top = -1; //栈顶，空时为 -1

    /**
     * 构造方法：指定栈的大小
     * @param maxSize
     */
    public ArrayStack (int maxSize) {
        this.maxSize = maxSize;
        this.stack = new ArrayList<>(maxSize);
    }

    /**
     * 判断栈是否已满
     * @return
     */
    public boolean isFull() {
        return top == maxSize - 1;
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
    public void push(T element) {
        if(this.isFull()) {
            System.out.println("当前栈已满！");
        } else {
            this.stack.add(++this.top,element);
        }
    }


    /**
     * 查看栈
     * @return
     */
    public T get() {
        if(this.isEmpty()) {
            System.out.println("当前栈为空！");
            return null;
        }

        return this.stack.get(this.top);
    }

    /**
     * 出栈
     * @return
     */
    public T pop() {
        if(this.isEmpty()) {
            System.out.println("当前栈为空！");
            return null;
        }

        return this.stack.get(this.top--);
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
            System.out.println(this.stack.get(i));
        }
    }
}
