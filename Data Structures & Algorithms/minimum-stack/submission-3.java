class MinStack {

    Stack <Integer>stack = new Stack <>();
    Stack <Integer> minstack = new Stack <>();
    int min = Integer.MAX_VALUE ;
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        min = Math.min(min , val);
        minstack.push(min); 
    
    }
    
    public void pop() {
        int pop  = stack.pop();
        int minpop = minstack.pop();
        if(!minstack.isEmpty())
        {
            min = minstack.peek();
        }else{
            min =Integer.MAX_VALUE;
        }
         
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
