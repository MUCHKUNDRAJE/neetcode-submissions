class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList <Integer> list = new ArrayList<>();
        
        for (int i : nums){
             map.put(i , map.getOrDefault(i , 0  )+ 1);
        }


        PriorityQueue <Integer> heap = new   PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        
         for (int i : map.keySet())
         {
            heap.add(i);
            if(heap.size() > k){
                heap.poll();
            }
         }

         System.out.print(heap);

     return heap.stream().mapToInt(i ->i).toArray();
         
      

    }
}
