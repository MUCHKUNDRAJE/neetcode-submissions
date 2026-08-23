class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l =0 ;
      
        int [] arr = new int [nums.length -k +1];
 
        int i = 0 ;
        for(int r = 0 ; r < nums.length ;r++)
        {
            
            if( r - l + 1 == k )
            {
                  int max = Integer.MIN_VALUE ;
               for(int j = l ; j <= r ;j++)
               {
                 max = Math.max(max , nums[j]);
                
               }
             
               arr[i] = max;
               i++;
               l++  ;
            }
        }



return arr; 
    }
}