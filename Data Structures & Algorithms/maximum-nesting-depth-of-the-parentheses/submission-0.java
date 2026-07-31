class Solution {
    public int maxDepth(String s) {
        
        Stack <Character> stack = new Stack<>();
         int count = 0 ;
         int result = 0;
        for(char x : s.toCharArray())
        { 
            if(x == '(')
            {
                stack.push(x);
                count++;
            }else if(x==')'){
                stack.pop();
                count--;
            }

            result =Math.max(result, count);

        }


return result;


    }
}