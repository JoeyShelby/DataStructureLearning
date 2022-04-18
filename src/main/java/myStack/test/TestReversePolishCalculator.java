package myStack.test;

import myStack.reversePolishCalculator.ReversePolishCalculator;

public class TestReversePolishCalculator {
    public static void main(String[] args) {
        ReversePolishCalculator reversePolishCalculator = new ReversePolishCalculator(" 3 4 + 5 * 6 -");
        System.out.println(reversePolishCalculator.calculate());
    }
}
