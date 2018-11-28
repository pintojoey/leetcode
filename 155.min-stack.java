class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Node> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        if (x < min)
	  min = x;
        stack.push(new Node(x,min));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().value;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
    class Node {
       public int value;
       public int min;

       public Node (int value, int min) {
          this.value = value;
          this.min = min;
       }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
