import java.util.*;

public class Q1{
	public static void main(String[] args) {
		
	}
	public List<List<String>> Anagrams(String[] string_list) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str: string_list){
            //convert the string into temporary character array
            char[] temp = str.toCharArray();
            //sort the characters lexicographically
            Arrays.sort(temp);
            //Now we have the key string
            String key = new String(temp);
            //all that is left now is to map it.
            
            //if map doesnt has the key string, then 
            // we map it to an empty list
            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());
            //adding the original string corresponding to the key's list
            map.get(key).add(str);
        }
        
        //Now we have to extract the anagrams list
        //from our populated map
        List<List<String>> ans = new ArrayList<>();
        for(String key: map.keySet())
            ans.add(new ArrayList<>(map.get(key)));
        return ans;
    }
}