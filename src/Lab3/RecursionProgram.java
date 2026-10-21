/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import Lab2.LinkedList;
import Framework.ConsoleFramework;

/**
 *
 * @author ricaa
 */
public class RecursionProgram extends ConsoleFramework {

    private LinkedList numbers = new LinkedList();

    @Override
    public void startProgram() {
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.add(35);
        numbers.add(45);
        numbers.add(55);
    }

    @Override
    public int showMenu() {
        System.out.println();
        System.out.println("1. Factorial");
        System.out.println("2. MyPow");
        System.out.println("3. IsPalindrome");
        System.out.println("4. PrintList : Forward");
        System.out.println("5. PrintList : Backward");
        System.out.println("6. IndentOfTron");
        System.out.println("7. Fibonacci");
        System.out.println("0. Exit");

        return readInt(">> ");
    }

    @Override
    public void executeAction(int choice) {
        if (choice == 1) {
            int n = readInt("Enter a number from 0 to 20: ");

            if (n < 0 || n > 20) {
                System.out.println("Please enter a number from 0 to 20.");
                return;
            }

            System.out.println(n + "! = " + RecursionApplication.factorial(n));
        } else if (choice == 2) {
            int a = readInt("Enter the base: ");
            int b = readInt("Enter a positive exponent: ");

            if (b < 1) {
                System.out.println("The exponent must be at least 1.");
                return;
            }

            System.out.println(a + "^" + b + " = " + RecursionApplication.myPow(a, b));
        } else if (choice == 3) {
            String word = readString("Enter a word: ");

            if (word.isEmpty()) {
                System.out.println("Please enter a word: ");
                return;
            }

            System.out.println("Is it a palindrome? " + RecursionApplication.isPalindrome(word));
        } else if (choice == 4) {
            System.out.println("List forward:");
            numbers.recursivePrint();

        } else if (choice == 5) {
            System.out.println("List backward:");
            numbers.recursivePrintBackward();

        } else if (choice == 6) {
            int n = readInt("Enter the number of calls (1 to 20): ");

            if (n < 1 || n > 20) {
                System.out.println("Please enter a number from 1 to 20.");
                return;
            }

            RecursionApplication.indentoTron(n);

        } else if (choice == 7) {
            int n = readInt("Enter a Fibonacci position from 0 to 30: ");

            if (n < 0 || n > 30) {
                System.out.println("Please enter a number from 0 to 30.");
                return;
            }

            System.out.println("Fibonacci(" + n + ") = "
                    + RecursionApplication.fibonacci(n));

        } else {
            System.out.println("Please choose an option from 0 to 7.");
        }
    }

    public static void main(String[] args) {
        RecursionProgram program = new RecursionProgram();
        program.run();
    }

}
