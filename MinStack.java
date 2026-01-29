class MinStack {
    LinkedList<Integer> stack;
    LinkedList<Integer> minstack;

    public MinStack() {
        stack=new LinkedList<>();
        minstack= new LinkedList<>();
        
    }
    
    public void push(int val) {
        stack.addLast(val);
        if(minstack.size()==0){
            minstack.addLast(val);
        }else
        {
            int a= minstack.peekLast();
            minstack.addLast(Math.min(val,a));

        }
        
    }
    
    public void pop() {
        stack.removeLast();
        minstack.removeLast();       
    }
    
    public int top() {
       return stack.peekLast();
        
    }
    
    public int getMin() {
        return minstack.peekLast();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */