package ComProg2;

public class RemoveWhiteSpace {

  public static void main(String[] args) {

       String newString = " Removing  white  spaces  in  a  string";
       
       System.out.print(newString.replaceAll("\\s+", ""));
  }

}
