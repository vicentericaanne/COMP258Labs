/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258labs;
import java.util.LinkedList;
/**
 *
 * @author ricaa
 */
public class BuiltInLinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> numbers = new LinkedList<>();
        
        numbers.add(12);
        numbers.add(7);
        numbers.add(25);
        numbers.add(4);
        numbers.add(18);
        
        // 1. Display the number of items
        System.out.println("1. Number of items: "+ numbers.size());
        
        // 2. Display all items
        System.out.println("2. All items:");
        displayItems(numbers);
        
        // 3. Add an item
        numbers.add(30);
        System.out.println("3. Add 30:");
        displayItems(numbers);
        
        //4. Add an item at a position
        numbers.add(2, 15);
        System.out.println("4. Add 15 at index 2:");
        displayItems(numbers);
        
        //5. Remove an item at a position
        numbers.remove(4);
        System.out.println("5. Remove item at index 4:");
        displayItems(numbers);
        
        //6. Get an item at a position
        System.out.println("6. Item at index 3: " + numbers.get(3));
        
        //7. Replace an item at a position
        numbers.set(0, 100);
        System.out.println("7. Replace item at index 0 with 100:");
        displayItems(numbers);
        
        //8. Add to the front
        numbers.addFirst(50);
        System.out.println("8. Add 50 to the front:");
        displayItems(numbers);
        
        //9. Add to the end
        numbers.addLast(60);
        System.out.println("9. Add 60 to the end:");
        displayItems(numbers);
        
        //10. Remove the first item
        numbers.removeFirst();
        System.out.println("10. Remove the first item:");
        displayItems(numbers);
        
        //11. Remove the last item
        numbers.removeLast();
        System.out.println("11. Remove the last item:");
        displayItems(numbers);
        
        System.out.println("Final size: " + numbers.size());
        }
    
        public static void displayItems(LinkedList<Integer> numbers){
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
}
