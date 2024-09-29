package stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackArrayList {
    private ArrayList<Integer>  stackList = new ArrayList<>();

    public ArrayList<Integer> getStackList() {
        return stackList;
    }

    public void printStack(){
        for(int i = stackList.size()-1;i>=0;i--){
            System.out.println(stackList.get(i));
        }
    }
    public boolean isEmpty(){
        return stackList.size() ==0;
    }

    public int peek(){
        if(isEmpty()){
            return 0;
        }else{
            return stackList.get(stackList.size()-1);
        }
    }
    public void push(int value){
        stackList.add(value);
    }
    public void pop(){
        stackList.remove(stackList.size()-1);
    }
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        String reversedString = "";
        for(char c: str.toCharArray()){
            stack.push(c);
        }
        while(!stack.isEmpty()) reversedString += stack.pop();
        return reversedString;
    }

    public static boolean isBalancedParentheses(String str){
        Stack<Character> stack = new Stack<>();
        for (char p : str.toCharArray()){
            if(p=='('){
                stack.push(p);
            }else if(p== ')'){
                if(stack.isEmpty()|| stack.pop() !='('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}