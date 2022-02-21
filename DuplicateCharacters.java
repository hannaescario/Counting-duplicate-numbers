package ComProg2;

public class DuplicateCharacters {

  public static void main(String[] args) {

    // given input string
    String input = "JuoginJanhelEE";

   // convert string into stream
   Map<Character, Long> result = input.chars() .mapToObj(c -> (char) c) 
   .collect(Collectors.groupingby(c -> c, Collectors.counting()));
   
   result.forEach((k, v) -> {
     if(v >  1) {
        System.out.println(k + " : " + v);
     }
   });
  }

}
