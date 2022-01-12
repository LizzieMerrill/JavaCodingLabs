import java.util.Scanner;
public class TipCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.print("Enter the check amount : ");
      double checkAmt = scnr.nextDouble();
      System.out.print("");
      
      //Lines 12-16 detail total cost to the customer with different tip percentages added
      
      double tip10 = checkAmt*1.10;
      double tip15 = checkAmt*1.15;
      double tip20 = checkAmt*1.20;
      double tip25 = checkAmt*1.25;
      double tip30 = checkAmt*1.30;
      
      //Lines 20-24 detail different tip amounts by themselves, separate from the rest of the check
      
      double tip1 = checkAmt*1.10 - checkAmt;
      double tip2 = checkAmt*1.15 - checkAmt;
      double tip3 = checkAmt*1.20 - checkAmt;
      double tip4 = checkAmt*1.25 - checkAmt;
      double tip5 = checkAmt*1.30 - checkAmt;
      
      
      System.out.printf("Total with 10%% tip ($%.2f) is $%.2f", tip1, tip10);
      System.out.printf("\nTotal with 15%% tip ($%.2f) is $%.2f", tip2, tip15);
      System.out.printf("\nTotal with 20%% tip ($%.2f) is $%.2f", tip3, tip20);
      System.out.printf("\nTotal with 25%% tip ($%.2f) is $%.2f", tip4, tip25);
      System.out.printf("\nTotal with 30%% tip ($%.2f) is $%.2f", tip5, tip30);
      System.out.print("\n");
      
   }
}
