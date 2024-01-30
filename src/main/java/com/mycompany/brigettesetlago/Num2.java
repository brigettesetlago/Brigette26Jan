/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.brigettesetlago;

/**
 *
 * @author Capaciti
 */

        import java.util.Scanner;

public class Num2 {

    public static void main(String[] args) {
        // Get a number from the user
        try (Scanner scanner = new Scanner(System.in)) {
            // Get a number from the user
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Check if the number is a multiple of 3 or 5
            if (num % 3 == 0 || num % 5 == 0) {
                // Print the sum
                System.out.println("The number is a multiple of 3 or 5.");
            } else {
                System.out.println("The number is not a multiple of 3 or 5.");
            }
        }
    }
}

    
    

