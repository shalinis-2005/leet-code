class MyStack {
    Queue<Integer> q1=new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
     q1.offer(x);  
    }
    
    public int pop() {
        int size=q1.size()-1;
        while(size!=0)
        {
            int val=q1.peek();
            q1.poll();
            q1.offer(val);
            size--;
        }
        var it=q1.peek();
        q1.poll();
        return it;
    }
    
    public int top() {
    int size=q1.size()-1;
        while(size!=0)
        {
            int val=q1.peek();
            q1.poll();
            q1.offer(val);
            size--;
        }
        var it=q1.peek();
        q1.poll();
        q1.offer(it);
        return it;   
    }
    
    public boolean empty() {
    if(q1.isEmpty()==true)
    { 
        return true;
    } 
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */