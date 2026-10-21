/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import Lab2.Node;
import Lab2.LinkedList;

/**
 *
 * @author ricaa
 */
public class RecursionApplication {

    //A recursive method is a method that:
    //1. Calls itself (is recursive)
    //2. Works towards a bas case (or base cases)
    public static int sumNumbersTo(int x) {
        if (x == 1) {
            return 1;
        }
        return x + sumNumbersTo(x - 1);
    }

    //Factorial
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Factorial requires a non-negative number.");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int myPow(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a * myPow(a, b - 1);
    }

    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    public static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        } else if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrome(s, start + 1, end - 1);
    }

    //PrintList Forward
    public static void printList() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);

        list.recursivePrint();
        System.out.println("List Backward");
        list.recursivePrintBackward();
    }

    public static void indentoTron(int n) {
        indentoTron(n, 1);
    }

    public static void indentoTron(int n, int callNumber) {
        if (callNumber > n) {
            return;
        }

        String indent = "  ".repeat(callNumber - 1);
        System.out.println(indent + "This was written by call number " + callNumber + ".");

        indentoTron(n, callNumber + 1);

        System.out.println(indent + "This ALSO written by call number " + callNumber + ".");
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Enter a non-negative number.");
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Sum of numbers between 1 and 20 = " + sumNumbersTo(20));
        System.out.println("5! = " + factorial(5));
        System.out.println("A^B = " + myPow(3, 3));
        System.out.println("is racecar a palindrome: " + isPalindrome("racecar"));
        System.out.println("is subtle a palindrome: " + isPalindrome("subtle"));
        System.out.println("Recursive List Print");
        printList();
        indentoTron(4);

        System.out.println("Fibonacci(7) = " + fibonacci(7));
    }
}
