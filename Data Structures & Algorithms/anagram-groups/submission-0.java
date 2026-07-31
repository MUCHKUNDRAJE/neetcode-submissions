class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
     HashMap <String , List<String>> map = new HashMap<>();
     
     for(String S : strs)
     {
       
       char [] arr = S.toCharArray();
       Arrays.sort(arr);

       String Key = new String (arr);

       map.putIfAbsent(Key, new ArrayList<>());

       map.get(Key).add(S);

     }
 
      
    
   
 
     return new ArrayList<>(map.values());


    }
}
