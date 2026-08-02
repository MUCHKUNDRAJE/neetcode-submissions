class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> list  = new ArrayList<>();
       List<Integer> sublist  = new ArrayList<>();
        dfs(list , 0 , sublist ,nums );
        return list;
    }
 
 public static void dfs( List<List<Integer>> list  , int index ,  List<Integer> sublist , int [] nums)
 {

    list.add(new ArrayList<>(sublist));


    for(int i = index ; i < nums.length ;i++)
    {
       sublist.add(nums[i]);
       dfs(list, i +1, sublist , nums);
       sublist.remove(sublist.size()-1);

    }

 }


}
