public class Calculator {

    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        char c;
        while ((c = (char) System.in.read()) != 0) {
            calc.getToken(c);
        }
    }

    private MyStack<Integer> stack;
    public Calculator() {
        stack = new MyStack<>();
    }

    public void getToken(char c) {
        if ('0' <= c && c <= '9') {
            newValueToken((int) (c - '0'));
        } else {
            switch (c) {
                case '+':
                    newPlus();
                    break;
                case '-':
                    newMinus();
                    break;
                case '*':
                    newMultiply();
                    break;
                case '/':
                    newDivide();
                    break;
                case '=':
                    evaluate();
                    break;
                case '\n':
                case '\t':
                case '\r':
                case ' ':
                    break;
                default:
                    System.out.println("Error bad input!!!Allowed inputs are: 0-9,+,-,*,/ and =");
            }
        }

    }

    protected void newValueToken(int d) {
        stack.push(d);
    }

    protected void newPlus() {
        stack.push(stack.pop() + stack.pop());
    }

    protected void newMinus() {
        int op1 = stack.pop();
        int op2 = stack.pop();
        stack.push(op2 - op1);
    }

    protected void newDivide() {
        int op1 = stack.pop();
        int op2 = stack.pop();
        stack.push(op2 / op1);
    }

    protected void newMultiply() {
        stack.push(stack.pop() * stack.pop());
    }

// evaluate and reset the calculator
    protected void evaluate() {
        System.out.println("Value = " + stack.pop());
    }

}
