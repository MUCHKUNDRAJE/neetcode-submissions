class Solution {
    public boolean isValid(String s) {

      HashMap < Character , Character >  map = new HashMap <>();
      Stack <Character> stack = new Stack<>();

      map.put(')','(');
      map.put('}','{');  
      map.put(']','[');

      for(char x : s.toCharArray())
      {
        if (!map.containsKey(x))
        {
            stack.push(x);
        }else if(stack.peek() == map.get(x))
        {
            stack.pop();
        }

      
          
      }
      if(stack.isEmpty())
      {
        return true;
      }
          
   
return false;

    }
}
