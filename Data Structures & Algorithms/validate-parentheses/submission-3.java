class Solution {
    public boolean isValid(String s) {

      HashMap < Character , Character >  map = new HashMap <>();
      Stack <Character> stack = new Stack<>();

      map.put(')','(');
      map.put('}','{');  
      map.put(']','[');

      for(char x : s.toCharArray())
      {
          stack.push(x);
          if(stack.peek() != map.get(x))
          {
            stack.pop();
          }
          
      }
          
   
return stack.isEmpty();

    }
}
