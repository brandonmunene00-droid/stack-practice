public class Stackpractice {

    static final int MAX = 5;
    static int top = -1;
    static int[] stack = new int[MAX];

    // Function to add an element to the stack
    static void push(int x) {
        if (top == MAX - 1) {
            System.out.println("Stack is Full");
        } else {
            top++;
            stack[top] = x;
            System.out.println(x + " has been added");
        }
    }

    // Function to remove an element from the stack
    static int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int x = stack[top];
            top--;
            System.out.println(x + " has been removed");
            return x;
        }
    }

    // Function to display the stack
    static void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + "\t");
        }
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);

        System.out.println();
        display();

        System.out.println();

        pop();
        pop();

        System.out.println();

        display();
    }
}
