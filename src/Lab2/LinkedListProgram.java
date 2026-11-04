/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import Framework.ConsoleFramework;
import comp258labs.ArrayManager;
import Exceptions.OutOfBoundsException;
import Exceptions.NoItemsException;

/**
 *
 * @author ricaa
 */
public class LinkedListProgram extends ConsoleFramework {

    LinkedList numbers = new LinkedList();

    public void startProgram() {

        int capacity = 20;
        numbers = new LinkedList();
        for (int i = 0; i < capacity; i++) {
            int number = (int) (Math.random() * 100) + 1;
            numbers.add(number);
        }
    }

    public void endProgram() {
        System.out.println("You are done managing your list");
    }

    public int showMenu() {
        System.out.println("1. Add Before");
        System.out.println("2. Add After");
        System.out.println("3. Print all");
        System.out.println("4. Get current");
        System.out.println("5. Get item at");
        System.out.println("6. Delete current");
        System.out.println("7. Advance");
        System.out.println("8. Start");
        System.out.println("0. Exit");

        int option = this.readInt(">>");
        return option;
    }

    public void executeAction(int choice) {
        if (choice == 1) {
            addBefore();
        } else if (choice == 2) {
            addAfter();
        } else if (choice == 3) {
            print();
        } else if (choice == 4) {
            getCurrent();
        } else if (choice == 5) {
            getItemAt();
        } else if (choice == 6) {
            delete();
        } else if (choice == 7) {
            advance();
        } else if (choice == 8) {
            start();
        }
    }

    public void addBefore() {
        int number = this.readInt("Enter number: ");
        try {
            numbers.addBefore(number);
            System.out.println("Added before current");
        } catch (NoItemsException e) {
            System.out.println("No current item. Choose Start first.");
        }
    }

    public void addAfter() {
        int number = this.readInt("Enter number: ");
        try {
            numbers.addAfter(number);
            System.out.println("Added after current");
        } catch (NoItemsException e) {
            System.out.println("No current item. Choose Start first.");
        }
    }

    public void print() {
        numbers.print();
    }

    public void getCurrent() {
        try {
            System.out.println("Current = " + numbers.getCurrent());
        } catch (NoItemsException e) {
            System.out.println("No current item");
        }
    }

    public void getItemAt() {
        int pos = this.readInt("Enter position (starting at 0): ");

        try {
            if (pos < 0) {
                throw new OutOfBoundsException();
            }

            numbers.start();

            for (int i = 0; i < pos; i++) {
                if (numbers.advance() == false) {
                    throw new OutOfBoundsException();
                }
            }

            System.out.println("Current = " + numbers.getCurrent());
        } catch (OutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (NoItemsException e) {
            System.out.println("No current item");
        }
    }

    public void delete() {
        try {
            numbers.deleteCurrent();
            System.out.println("Current removed");
        } catch (NoItemsException e) {
            System.out.println("No current item to remove");
        }
    }

    public void advance() {
        try {
            if (numbers.advance()) {
                System.out.println("Current advanced: Current=" + numbers.getCurrent());
            } else {
                System.out.println("Cannot advance: no next item");
            }
        } catch (NoItemsException e) {
            System.out.println("No current item");
        }
    }

    public void start() {
        numbers.start();
        System.out.println("Current moved to start");
    }

    public static void main(String[] args) {
        LinkedListProgram program = new LinkedListProgram();
        program.run();
    }

}
