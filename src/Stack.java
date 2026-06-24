// A fixed-size stack data structure that stores String values.
// Follows Last-In, First-Out (LIFO) ordering.

public class  Stack {

    private String[]arr;// Internal array to hold stack elements
    private int top; // Index of the current top element (-1 means empty)
    private int size;// Maximum number of elements the stack can hold

    // Initializes the stack with a given maximum capacity
    public Stack(int size){
        this.size=size;
        arr=new String[size];
        top=-1;// Stack starts empty
    }

    // Returns true if the stack has no elements
    public boolean isEmpty(){
        return top ==-1;

    }

    // Returns true if the stack has reached its maximum capacity
    public boolean isFull(){
        return top ==size -1;

    }

    // Adds a new value to the top of the stack
    // Does nothing if the stack is already full
    public void push(String value){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[++top] =value;// Increment top first, then insert the value

    }

    // Removes and returns the value at the top of the stack
    // Returns null if the stack is empty
    public String pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return arr[top--];// Return the top value, then decrement top



    }


    // Returns the value at the top of the stack without removing it
    // Returns null if the stack is empty
    public String peek(){
        if(isEmpty()){
            return null;

        }

        return arr[top];
    }
}

