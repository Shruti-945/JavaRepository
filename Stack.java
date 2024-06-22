import java.util.*;
public class Stack {
    public static void main(String[] args) {
       // stack variable in stack memory
        //new object of stack is created in the heap memory
        //Generics<>
        //Internally stack is an array
        
        Stack<Integer> stack= new Stack<>();
        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(45);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
