class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      List<List<String>> list = new ArrayList<>();

      HashMap<String ,  List<String> > map = new HashMap<>();

      for (String s : strs)
      {
        char [] c = s.toCharArray();
        Arrays.sort(c);
       String ans =  String.valueOf(c); 
        if( map.containsKey(ans)){
            map.get(ans).add(s);
        }
       else{
       List<String>  List2 =  new ArrayList<>() ;
       List2.add(s);
        map.put(ans , List2 );
       }

      }   
 

return new ArrayList<>(map.values());


    }
}
