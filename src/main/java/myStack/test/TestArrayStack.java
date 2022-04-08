package myStack.test;

import myStack.arrayStack.ArrayStack;

public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        //栈空
        arrayStack.list();
        System.out.println("栈空？"+arrayStack.isEmpty());
        System.out.println("栈满？"+arrayStack.isFull());
        arrayStack.pop();

        //栈不空不满
        arrayStack.push(12);
        arrayStack.list();
        arrayStack.push(23);
        arrayStack.list();
        arrayStack.push(34);
        arrayStack.list();
        arrayStack.push(45);
        arrayStack.list();
        System.out.println("栈空？"+arrayStack.isEmpty());
        System.out.println("栈满？"+arrayStack.isFull());

        //栈满
        arrayStack.push(100);
        arrayStack.push(100);
        arrayStack.push(100);
        System.out.println("栈空？"+arrayStack.isEmpty());
        System.out.println("栈满？"+arrayStack.isFull());
        arrayStack.list();

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());

    }
}
