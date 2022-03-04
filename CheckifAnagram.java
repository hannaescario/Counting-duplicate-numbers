package ComProg2;

import java.util.Array;


public class CheckifAnagram {

  public static void main(String[] args) {
  
  String str1 = "abcde";
  String str2 = "ecdab";
  
  if(str1.length()!=str2.lenght())
  {
    System.out.println("length is different then the strings are not anagram");
  }
  }
 else {
       
       char[] ch1 = str1.toCharArray();
       char[] ch2 = str2.toCharArray();
       
       Array.sort(ch1);
       Array.sort(ch2);
       
       if (Arrays.equals(ch1,ch2)){
         System.out.println("Both strings are anagram");
       }
       else {
         System.out.println("Both strings are not anagram");
       }
 }
}
