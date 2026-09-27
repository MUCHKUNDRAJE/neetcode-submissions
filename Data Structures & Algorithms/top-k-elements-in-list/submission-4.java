class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList <Integer> list = new ArrayList<>();
        
        for (int i : nums){
             map.put(i , map.getOrDefault(i , 0  )+ 1);
        }

          for (int i : nums){
            if(map.get(i) >= k)
            {
               if(!list.contains(i))
               {
                  list.add(i);
               }
            }
        }

 return list.stream().mapToInt(i ->i).toArray();
         
      

    }
}
