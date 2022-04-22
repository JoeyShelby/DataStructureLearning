package stack.test;

import stack.arrayStack.ArrayStack;

public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>(10);

        //栈空
        stack.list();
        System.out.println("栈空？"+stack.isEmpty());
        System.out.println("栈满？"+stack.isFull());
        stack.pop();

        //栈不空不满
        stack.push("+");
        stack.push("-");
        stack.push("*");
        stack.push("/");
        stack.push("/");
        stack.push("/");
        stack.push("/");
        stack.push("/");
        stack.push("/");
        stack.push("/");
        stack.push("/");
        stack.push("/");
        stack.push("/");
        stack.list();
        System.out.println("栈空？"+stack.isEmpty());
        System.out.println("栈满？"+stack.isFull());

        //栈满
        stack.push("/");
        stack.push("/");
        stack.push("/");
        System.out.println("栈空？"+stack.isEmpty());
        System.out.println("栈满？"+stack.isFull());
        stack.list();

    }
}
