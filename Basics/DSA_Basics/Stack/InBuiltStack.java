package DSA_Basics.Stack;

import java.util.Stack;

public class InBuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //stack follows the LIFO And FILO rule
        //each element inserted goes in forward order
        //pushed function is used to insert in the stack
        //goes in downward order

        stack.push(45);
        stack.push(78);
        stack.push(92);
        stack.push(49);

        //peek function is used to show the top of the stack

        System.out.println("The top of the stack is: "+stack.peek());

        //pop function is use to remove the top element of the stack
        //at every pop function (removal) the next element in order becomes the top
        //if you pick ball from the box. you pick the first one at top and then the second one and continue

        System.out.println("Popping from the stack: ");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //if you have popped each element from the stack
        //and if you try to peek and pop in the stack
        //it throws EmptyStackException


    }
}
