class Solution {

    public void backtrack(int[] nums , int target  , int index ,List <Integer> sublist , List<List<Integer>> list)
    {
        if(target == 0 )
        {
            list.add(new ArrayList<>(sublist));
            return ;
        }  
         
        if(target < 0)
        {
            return ;
        } 

      for(int i = index ; i < nums.length ; i++)
      {
        sublist.add(nums[i]);
        backtrack(nums,target - nums[i] , i , sublist , list);
        sublist.remove(sublist.size()-1);
      }

    }
    
    
    
    
    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
          backtrack(nums, target , 0 ,new ArrayList(),list);

         System.out.print(list);
        return list;
    }
}
