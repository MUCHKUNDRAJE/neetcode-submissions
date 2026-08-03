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
        }else {
            
            if(stack.isEmpty() || stack.peek()!= map.get(x))
        {
            return false;
        }

            stack.pop();
      
        }  
      }
 
          
   
return stack.isEmpty();

    }
}
