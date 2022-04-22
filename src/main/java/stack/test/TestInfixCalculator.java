package stack.test;

import stack.infixCalculator.InfixCalculator;

public class TestInfixCalculator {
    public static void main(String[] args) {
        InfixCalculator infixCalculator = new InfixCalculator("7*2*2-5+1-5+3-4");
        System.out.println(infixCalculator.calculate());;
    }
}
