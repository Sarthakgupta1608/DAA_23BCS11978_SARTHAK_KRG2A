//Aim: Analyze if the stack is empty or full, and if elements are present, return the top element in the stack using templates. Also, perform push and pop operations on the stack.
import java.util.ArrayList;
import java.util.List;

class Stack<T> {
    private List<T> list;     // Internal storage
    private int capacity;

    // Constructor
    public Stack(int size) {
        capacity = size;
        list = new ArrayList<>(size);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Check if stack is full
    public boolean isFull() {
        return list.size() == capacity;
    }

    // Push element
    public void push(T item) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + item);
            return;
        }
        list.add(item);
        System.out.println(item + " pushed into stack.");
    }

    // Pop element
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return null;
        }
        return list.remove(list.size() - 1);
    }

    // Peek top element
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No top element.");
            return null;
        }
        return list.get(list.size() - 1);
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements: " + list);
    }
}

// Demo
public class experiment1code {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>(5);

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        intStack.display();
        System.out.println("Top element: " + intStack.peek());

        intStack.pop();
        intStack.display();

        System.out.println("Is Empty? " + intStack.isEmpty());
        System.out.println("Is Full? " + intStack.isFull());
    }
}
