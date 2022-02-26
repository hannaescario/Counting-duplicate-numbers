package ComProg2;

import java.util.HashMap;


public class NonRepeatingCharacter {

  public static void main(String[] args) {
  
        String str = " aaccgbbdee";
        HashMap<Character,Integer> hmap = new HashMap <Character,Integer>();
        
        int lengthOfString = str.length();
        
        for(int i=0;i<lengthOfString;i++) {
          Character currentCharacter = str.charAt(i);
          if(hmap.containsKey(currentCharacter)==false) {
            hmap.put(currentCharacter,1);
            
          }else {
            int currentFreq = hmap.get(currentCharacter);
            currentCharacter++;
            hmap.put(currentCharacter, currentFreq);
          }
        }
        
       for(int i=0;i<lengthOfString;i++) {
         Character currentCharacter = str.charAt(i);
         int currentFreq = hmap.get(currentCharacter);
         if(currentFreq == 1) {
           System.out.print(currentCharacter);
         }
       }
  }

}
