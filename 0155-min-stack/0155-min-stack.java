import java.util.*;
class MinStack {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
       s1.push(value); 
       if(minStack.isEmpty() ||value <= minStack.peek())
       minStack.push(value);
    }
    
    public void pop() {
        if(s1.peek().equals(minStack.peek()))
        minStack.pop();
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
       // int minElement=Integer.MAX_VALUE;
        //Stack<Integer> s2=new Stack<>();
        //while(!s1.isEmpty())
        //{
           // int value=s1.peek();
            //minElement=Math.min(minElement,value);
            //s2.push(value);
            //s1.pop();
        //}
        //while(!s2.isEmpty())
       // {
            //s1.push(s2.peek());
           // s2.pop();
        //
        }

}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */