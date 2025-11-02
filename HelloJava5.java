import java.util.Scanner;

public class HelloJava5 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String text;
      
      System.out.print("Enter your text : ");
      text = scnr.nextLine();
      
      System.out.printf("Java says \"%s\"", text);
      System.out.print("\n");
      
   }
}
