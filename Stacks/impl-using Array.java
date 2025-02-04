class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
       
        arr[++top]=x;
    }

    public int pop() {
        // Your Code
        if(top!=-1)
        {
            return arr[top--];
            
        }
        else
        return top;
    }
}

//GPT
import java.util.EmptyStackException;

class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];  // Initialize the stack with a size of 1000
        top = -1;  // Start with an empty stack
    }

    // Push an element onto the stack
    public void push(int x) {
        // Avoid pushing if the stack is full (optional, based on the problem's requirements)
        if (top < arr.length - 1) {
            arr[++top] = x;
        } else {
            throw new StackOverflowError("Stack is full");
        }
    }

    // Pop the top element from the stack
    public int pop() {
        // Check if the stack is empty
        if (top == -1) {
            throw new EmptyStackException();  // Throw an exception if the stack is empty
        }
        return arr[top--];  // Return the top element and decrement top
    }

    // Peek the top element without removing it
    public int peek() {
        // Check if the stack is empty
        if (top == -1) {
            throw new EmptyStackException();  // Throw an exception if the stack is empty
        }
        return arr[top];  // Return the top element without changing the stack
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element: " + stack.peek());  // Should print 30
        
        System.out.println("Popped element: " + stack.pop());  // Should print 30
        System.out.println("Top element after pop: " + stack.peek());  // Should print 20
        
        System.out.println("Is stack empty? " + stack.isEmpty());  // Should print false
        
        stack.pop();
        stack.pop();
        
        System.out.println("Is stack empty after popping all elements? " + stack.isEmpty());  // Should print true
    }
}
