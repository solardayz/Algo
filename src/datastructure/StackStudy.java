package datastructure;

import java.util.ArrayList;
import java.util.List;

public class StackStudy {
    
    private static class Stack<E> {
        private List<E> stack = new ArrayList<>();
        
        E push (E e) {
            stack.add(e);
            return e;
        }

        E pop () {
            if (stack.isEmpty()) {
                return null;
            }else{
                return stack.remove(stack.size() -1);
            }
        }
    }

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("a");
        stringStack.push("b");
        stringStack.push("c");
        stringStack.push("f");

        System.out.println("stringStack = " + stringStack.push("h"));
        stringStack.pop();
        stringStack.pop();
        stringStack.pop();
        String pop = stringStack.pop();
        System.out.println("pop = " + pop);

    }
}
