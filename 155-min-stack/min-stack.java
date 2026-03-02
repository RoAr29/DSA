class MinStack {

    Stack<Integer> MinStack;

    public MinStack() {
        MinStack = new Stack<>();
    }
    
    public void push(int val) {
        MinStack.push(val);
    }
    
    public void pop() {
        MinStack.pop();
    }
    
    public int top() {
        int top = MinStack.peek();
        return top;
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<MinStack.size(); i++){
            min = Math.min(min, MinStack.get(i));
        }
        return min;
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