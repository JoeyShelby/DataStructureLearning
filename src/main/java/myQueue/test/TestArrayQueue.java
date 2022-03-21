package myQueue.test;

import myQueue.ArrayQueue;

import java.util.Scanner;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(4);

        boolean flag = true;
        System.out.println("-----------环形数组队列测试------------");
        System.out.println("输入 e ： 查看队列是否为空");
        System.out.println("输入 f ： 查看队列是否已满");
        System.out.println("输入 a ： 向队列中添加元素");
        System.out.println("输入 g ： 元素出队");
        System.out.println("输入 s ： 打印队列中所有元素");
        System.out.println("输入 c ： 查看队列中的有效元素个数");
        System.out.println("输入 t ： 查看队列的首元素");
        System.out.println("输入 bye ： 退出系统");


        while(flag) {
            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.next();
            switch (cmd.charAt(0)) {
                case 'e':
                    if(arrayQueue.isEmpty()) {
                        System.out.println("队列为空！");
                    } else {
                        System.out.println("队列不为空！");
                    } ;
                    break;

                case 'f':
                    if(arrayQueue.isFull()) {
                        System.out.println("队列已满");
                    } else {
                        System.out.println("队列未满");
                    }
                    break;

                case 'a':
                    System.out.println("请输入要插入的元素：");
                    int element = new Scanner(System.in).nextInt();
                    arrayQueue.add(element);
                    break;

                case 'g':
                    arrayQueue.get();
                    break;

                case 's':
                    arrayQueue.showAll();
                    break;

                case 'c':
                    System.out.println("队列中元素数目："+arrayQueue.count());
                    break;

                case 't':
                    System.out.println(arrayQueue.theFirst());
                    break;

            }

            if(cmd.equals("bye")) flag = false;
        }
    }
}
