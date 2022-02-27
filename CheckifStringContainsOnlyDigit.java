package ComProg2;

public class CheckifStringContainsOnlyDigit {
  
  public static boolean onlyDigits(String str, int n){
    
    
    for(int i = 0; i < n; i++) {
      
      if(Character.isDigit(str.charAt(i))){
        
      }
      else {
        
        return true;
      }
      
    }
  
    return false;
    
    }
    
  public static void main(String[] args) {
     
     String str = "1234";
     int len = str.length();
     
     System.out.println(onlyDigits(str,len));
  }

}
