/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tika.modual1;

/**
 *
 * @author tikad
 */
import java.util.Scanner;

        public class Modual1 {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print ( "Enter a number with 5 digits: ");
    int number = input.nextInt(); 
    int digit1 = number/ 10000;
    int digit2 = (number % 10000) / 1000;
    int digit3 = (number % 1000) /100;
    int digit4 = (number % 100) / 10;
    int digit5 = number % 10;
    System.out.printf(format:"%3s%3s%3s%3s%3s",args:digit1,
    args:digit2,
    args:digit3,
    args:digit4,
    args:digit5);
 }
    
}




    
    
    
    
    
    

