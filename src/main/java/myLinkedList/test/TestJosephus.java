package myLinkedList.test;

import myLinkedList.Josephus.Josephus;

public class TestJosephus {
    public static void main(String[] args) {
        Josephus josephus = new Josephus(1,2,5);
        josephus.playGame();
    }
}
