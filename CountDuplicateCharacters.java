package ComProg2;

import java.util.HashMap;
import java.util.Map;


public class CountDuplicateCharacters {

  public static void main(String[] args) {

        String input = "javaajavaEE";
        
   Map<Character, Integer> countingDuplicateMap = new HashMap<>();
   
   char[] charArray = input.toCharArray();
   
   for(char c : charArray)(
   
   if(countDuplicateMap.containsKey(c){
     
     countingDuplicateMap.put(c,countDuplicateMap.get(c) + 1);
     
   }else{
     
     countDuplicateMap.put(c, 1);
   }
  }
  
   for(Entry<Character, Integer> entry : countDuplicateMap.entrySet()){
     
     if(entry.getValue() > 1){
       
       System.out.println(entry.getKey() + " : " + entry.getValue());
     }
   }
}
