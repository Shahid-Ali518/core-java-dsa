package corejava.collections;

import java.util.LinkedList;
import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

        // stack implements vector class
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);

        System.out.println(stack);

        System.out.println(stack.peek()); // return top nut not removed

        System.out.println("Returned and Removed: " + stack.pop()); // return top and removed

        System.out.println(stack);


        // LinkedList As a Stack
        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(3); // push() of stack
        list.addLast(4);
        list.addLast(5);

        System.out.println(list);

        list.getLast(); // peek() of stack
        list.removeLast(); // pop of stack

        System.out.println(list);





    }
}
