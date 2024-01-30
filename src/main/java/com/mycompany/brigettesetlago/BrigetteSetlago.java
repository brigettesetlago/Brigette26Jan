/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brigettesetlago;

import java.util.Scanner;

/**
 *
 * @author Brigette Setlago
 */
public class BrigetteSetlago {

    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
            // Get a number from the user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Initialize sum to 0
            int totalSum = 0;

            // Iterate through numbers below the given number
            for (int num = 0; num < number; num++) {
                // Check if the number is a multiple of 3 or 5
                if (num % 3 == 0 || num % 5 == 0) {
                    // Add the multiple to the sum
                    totalSum += num;
                    
                    
                    
                }
            }
         }
    }

    }

