class Solution {
    public int evalRPN(String[] tokens) {
          
     Stack <Integer> stack = new Stack<>();

     for(String t : tokens)
     {
        if(t.equals("+"))
        {
            stack.push(stack.pop() + stack.pop());
        }else  if(t.equals("-"))
        {
            stack.push(stack.pop() - stack.pop());
        }else   if(t.equals("*"))
        {
            stack.push(stack.pop()*stack.pop());
        }
        else   if(t.equals("/"))
        {
            stack.push(stack.pop() / stack.pop());
        }else{
             stack.push(Integer.parseInt(t));
        }
     }


return stack.peek();

    }
}
