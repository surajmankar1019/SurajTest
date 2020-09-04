package com.denomination;

import java.util.Scanner;

public class MoneyBreakdown {
 
   /**
    * @param args
    */
   public static void main(String[] args) {
       
      final int[] denominations = 
         { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
       
      Scanner scanner = new Scanner(System.in);
       
      // Get the amount to breakdown from user
       
      System.out.print("Enter amount (in cents): ");
      int amount = scanner.nextInt();
       
      // Determine how many of each denomination are required
       
      int[] count = breakdown(denominations, amount);
       
      // Output the result
       
      for (int i=0; i<denominations.length; i++) {
         if (count[i]>0) {
            System.out.println(count[i]+" x "+denominations[i]);
         }
      }
   }
 
   private static int[] breakdown(int[] denominations, int amount) {
      int[] count = new int[denominations.length];
       
      // Loop through each denomination (starting at largest)
       
      for (int i=0; i<denominations.length; i++) {
          
         // Use one of that denomination until we need something smaller
          
         while (amount>=denominations[i]) {
            count[i]++;
            amount -= denominations[i];
         }
      }
 
      return count;
   }
 
}
