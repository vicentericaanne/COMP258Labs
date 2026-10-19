/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import comp258labs.NoItemsException;

/**
 *
 * @author ricaa
 */
public class LinkedList {

    private Node items;
    private Node current;

    public LinkedList() {
    }

    public Node getItems() {
        return items;
    }

    public void setItems(Node items) {
        this.items = items;
    }

    public Object getCurrent() throws NoItemsException {
        if (current == null) {
            throw new NoItemsException();
        }

        return current.getData();
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    public void add(Object item) {
        Node n = new Node(item);
        if (items == null) {
            items = n;
            current = items;
        } else {
            current.next = n;
            current = current.next;
        }
    }

    public void print() {
        Node temp = items;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;

        }
    }

    public boolean advance() {
        if (current == null || current.next == null) {
            return false;
        }

        current = current.next;
        return true;
    }

    public void start() {
        current = items;
    }

    public void addAfter(Object item) throws NoItemsException {
        if (items != null && current == null) {
            throw new NoItemsException();
        }

        Node n = new Node(item);
        if (items == null) {
            items = n;
            current = items;
        } else {
            n.next = current.next;
            current.next = n;
        }
    }

    public void addBefore(Object item) throws NoItemsException {
        if (items != null && current == null) {
            throw new NoItemsException();
        }
        Node n = new Node(item);

        //Empty list
        if (items == null) {
            items = n;
            current = n;
        } //Add before the first node
        else if (current == items) {
            n.next = items;
            items = n;
        } // Find the node immediately before current
        else {
            Node temp = items;

            while (temp.next != current) {
                temp = temp.next;
            }

            n.next = current;
            temp.next = n;
        }
    }

    public void deleteCurrent() throws NoItemsException {
        if (current == null) {
            throw new NoItemsException();
        }

        // Delete the first node
        if (current == items) {
            items = current.next;
            current = items;
        } // Delete a node after the first
        else {
            Node temp = items;

            while (temp.next != current) {
                temp = temp.next;
            }

            temp.next = current.next;
            current = current.next;
        }
    }

    public void removeAllOccurances(Object o) {
        Node temp = items;
        Node previous = null;

        while (temp != null) {
            if (java.util.Objects.equals(temp.getData(), o)) {
                if (previous == null) {
                    items = temp.next;
                } else {
                    previous.next = temp.next;
                }

                if (current == temp) {
                    current = temp.next;
                }
            } else {
                previous = temp;
            }

            temp = temp.next;
        }
    }

//    public static void main(String[] args) throws NoItemsException {
//        LinkedList list = new LinkedList();
//
//        list.add(11);
//        list.add(77);
//        list.add(99);
//        list.add(55);
//        list.add(33);
//        //list.start();
//        //list.advance();
//        //list.advance();
//        //list.removeCurrent();
//        list.addAfter(66);
//        list.addBefore(65);
//        list.addBefore(64);
//        list.addBefore(63);
//
//        list.print();
//    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Object[] values = {1, 3, 4, 5, 3, 4, 3, 4, 1, 2, 5, 6};

        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }

        System.out.println("BEFORE:");
        list.print();

        list.removeAllOccurances(4);

        System.out.println("AFTER:");
        list.print();
    }

    public void recursivePrint() {
        recursivePrint(items);
    }

    public void recursivePrint(Node temp) {
        if (temp != null) {
            System.out.println(temp.getData());
            recursivePrint(temp.next);
        }
    }

    public void recursivePrintBackward() {
        recursivePrintBackward(items);
    }

    public void recursivePrintBackward(Node temp) {
        if (temp != null) {
            recursivePrintBackward(temp.next);
            System.out.println(temp.getData());
        }
    }

}
