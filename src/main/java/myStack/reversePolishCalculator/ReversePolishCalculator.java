package myStack.reversePolishCalculator;

import myStack.arrayStack.ArrayStack;

//逆波兰表达式计算器
public class ReversePolishCalculator {
    String expression = "";
    private ArrayStack<Integer> numStack = new ArrayStack<>(10);

    /**
     * 传入需要进行计算的表达式
     * @param expression
     */
    public ReversePolishCalculator(String expression) {
        this.expression = expression;
    }

    /**
     * 进行中缀表达式计算
     * @return 返回结果
     */
    public int calculate() {
        if(expression.length() == 0) return 0;
        for (int i = 0; i < expression.length(); i++) {
            char cur = expression.charAt(i);
            if(this.isNumber(cur)) numStack.push(Integer.parseInt(String.valueOf(cur))); //数字入栈
            else if(this.isOperate(cur)) {
                int num2 = numStack.pop();
                int num1 = numStack.pop();
                numStack.push(this.simpleCalculate(num1, num2, cur));
            }
        }

        //返回结果
        return numStack.pop();
    }

    /**
     * 判断当前字符是否为数字
     * @param ch
     * @return
     */
    private boolean isNumber(char ch) {
        return ch>='0' && ch<='9';
    }

    /**
     * 判断当前字符是否为运算符
     * @param ch
     * @return
     */
    private boolean isOperate(char ch) {
        return ch=='+' || ch=='-' || ch=='*' || ch=='/';
    }

    /**
     * 判断操作符优先级
     * @param oper1
     * @param oper2
     * @return
     */
    private boolean priority(char oper1, char oper2) {
        if(oper1=='*' || oper1=='/') {
            if(oper2=='+' || oper2=='-') {
                return true;
            }
        }
        //只有当oper1为*或/, 而oper2为=或-时才有会发生oper1的优先级大于oper2
        return false;
    }

    /**
     * 简单的三元计算
     * @return
     */
    private int simpleCalculate(int num1, int num2, char oper) {
        return switch (oper) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> -404;
        };
    }

}
