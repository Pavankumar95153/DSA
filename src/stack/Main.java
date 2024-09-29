package stack;

import static stack.StackArrayList.isBalancedParentheses;
import static stack.StackArrayList.reverseString;

public class Main {
    public static void main(String[] args){
        /*Stack stack = new Stack(4);
        stack.pushNode(1);
        stack.pushNode(5);
        stack.popNode();
        stack.printStack();*/

        StackArrayList stackArrayList = new StackArrayList();
        stackArrayList.push(5);
        stackArrayList.push(4);
        stackArrayList.push(3);
        stackArrayList.pop();
        stackArrayList.printStack();

        String reverse = reverseString("Pavan");
        System.out.println(reverse);
        boolean result = isBalancedParentheses("(())");
        System.out.println("result of stack parentheses-->"+result);

    }
}