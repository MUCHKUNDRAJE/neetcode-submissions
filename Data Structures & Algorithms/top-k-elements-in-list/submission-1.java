class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer >  map = new HashMap<>();
        int [] arr = new int[nums.length]; 
       for (int n : nums )
       {
          map.put(n , map.getOrDefault(n,0) + 1);
       }
       int index = 0 ; 
     for( int x : map.keySet())
     {
          if(map.get(x) > k )
          {
            arr[index] = x;
          }
          index++;
     }

       
 return Arrays.stream(arr).filter(num -> num != 0 ).toArray();

    }
}
