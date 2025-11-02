import java.util.Scanner;

public class Caffeine { 
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in); 
      
      //Input: Amount of caffeine recently ingested.
      System.out.print("Enter caffeine amount (in mg) : ");
      double caffeineMg = scnr.nextDouble(); 
      System.out.print("");
      
      double caffeine6 = caffeineMg*0.5;
      double caffeine12 = caffeineMg*0.25;
      double caffeine18 = caffeineMg/8.0;
      
      //The half-life of caffeine is used to calculate how much caffeine leaves the body after set periods of time.
      
      System.out.printf("After 6 hours  : %.2f mg", caffeine6);
      System.out.printf("\nAfter 12 hours : %.2f mg", caffeine12);
      System.out.printf("\nAfter 18 hours : %.2f mg", caffeine18);
      System.out.print("\n");
      
   }
}
