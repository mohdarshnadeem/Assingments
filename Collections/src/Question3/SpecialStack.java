package Question3;

import java.util.Stack;

public class SpecialStack {
   private Stack<Integer> mainStack;
   private Stack<Integer> minStack;
   private int capacity;

    public SpecialStack(int capacity) {
        this.capacity = capacity;
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val){
        if(isFull()){
            System.out.println("Cannot perform push operation! Stack is full");
            return;
        }
        mainStack.push(val);
        System.out.println("Successfully pushed: "+val);

        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }

    public boolean isFull(){
        return mainStack.size() == capacity;
    }

    public boolean isEmpty(){
        return mainStack.isEmpty();
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("main stack is empty! cannot pop");
        }
        int popped = mainStack.pop();
        System.out.println("Popped "+popped+" successfully");
        if(popped == minStack.peek()){
            minStack.pop();
        }
        return popped;
    }

    public int getMin(){
        if(minStack.isEmpty()){
            System.out.println("Empty stacks! no minimum");
            return -1;
        }
        return minStack.peek();
    }
}
