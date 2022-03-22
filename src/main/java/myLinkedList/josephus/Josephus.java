package myLinkedList.josephus;


/**
 * 使用环形单向链表解决约瑟夫环问题
 * N个人围成一圈，第一个人从1开始报数，报M的将被杀掉，下一个人接着从1开始报。如此反复，最后剩下一个，求最后的胜利者。
 */
public class Josephus {
    private CircleNode first; //指向第一个节点
    private int start; //从第几号节点开始
    private int m;  //报数
    private int count; //参与游戏的人数

    public Josephus(int start, int m, int count) {
        if(count < 1){
            throw new RuntimeException("游戏参与者不得少于 1 人");
        }
        if(start < 1 || start > count){
            throw new RuntimeException("start 只能是(0, " + count +"]的整数");
        }
        if(m < 1 || m > count){
            throw new RuntimeException("m 只能是(0, " + count +"]的整数");
        }
        this.start = start;
        this.m = m;
        this.count = count;
        this.createCircle();
    }

    private void createCircle(){     //构造环的方法不需要暴露
        CircleNode cur = new CircleNode(1, null);
        first = cur;
        cur.setNext(first); //第一个节点单独成环
        for(int i = 2; i <= count; i++) {
            CircleNode newNode = new CircleNode(i, null);
            cur.setNext(newNode);
            newNode.setNext(first);
            cur = cur.getNext();
        }
    }

    public void showCircle(){
        CircleNode cur = first;
        while(true) {
            System.out.println(cur);
            cur = cur.getNext();
            if(cur == first) break;
        }
    }

    public void playGame() { //玩约瑟夫环
        CircleNode cur = first;
        while(true) {      //放一个指针到 first 的后一个节点
            if(cur.getNext() == first) break;
            cur = cur.getNext();
        }

        for (int i = 1; i < start; i++) { //将 first 转移到游戏开始节点
            first = first.getNext();
            cur = cur.getNext();
        }

        while(cur != first){  //开始丢手绢
            for (int i = 1; i < m; i++) {
                first = first.getNext();
                cur = cur.getNext();
            }
            System.out.print("OUT:" + first +", ");
            first = first.getNext();
            cur.setNext(first);
        }
        System.out.println("OUT:" + first);
    }
}
