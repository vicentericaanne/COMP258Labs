/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import Lab4.Widget;

/**
 *
 * @author ricaa
 */
public class GenericList<T> {

    private GenericNode<T> items;
    private GenericNode<T> current;

    public void add(T item) {
        if (items == null) {
            items = new GenericNode(item);
            current = items;
        } else {
            current.next = new GenericNode(item);
            current = current.next;
        }
    }

    public T getCurrent() {
        return current.getData();
    }

    public void print() {
        GenericNode<T> temp = items;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        //GenericList<Integer> list = new GenericList<Integer>();
        GenericList<Widget> list = new GenericList<Widget>();
//        list.add(new Widget(2,"Hammer"));
//        list.add(5);
//        list.add(51);
//        list.add(2);
//        list.add(56);
//        list.add(58);
//        list.add(13);
//        //list.add("Cat");
//        list.add(12);
//        list.add(33);
//        list.print();

        list.add(new Widget(50, "Saw"));
        list.add(new Widget(30, "Hammer"));
        list.add(new Widget(75, "Axe"));
        list.add(new Widget(15, "Drill"));
        list.add(new Widget(26, "Apple"));
        list.add(new Widget(64, "Banana"));
        list.add(new Widget(55, "Orange"));
        list.add(new Widget(70, "Screw"));
        list.print();

        //int x = list.getCurrent();
        Widget x = list.getCurrent();
        System.out.println(">>" + x);
    }

}
