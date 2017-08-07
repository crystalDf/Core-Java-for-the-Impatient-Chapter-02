package ch02.ex;

import java.util.Iterator;
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String item = scanner.nextLine();
            if (!"-".equals(item)) {
                queue.enqueue(item);
            } else if (!queue.isEmpty()) {
                System.out.print(queue.dequeue() + " ");
            }
        }

        System.out.println("(" + queue.size() + " left on stack)");
    }
}

class Queue<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int n;

    private class Node {

        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void enqueue(Item item) {

        Node oldLast = last;

        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }

        n++;
    }

    public Item dequeue() {

        if (isEmpty()) {
            return null;
        }

        Item item = first.item;

        first = first.next;

        if (isEmpty()) {
            last = null;
        }

        n--;

        return item;
    }


    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {

            private Node current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Item next() {

                Item item = current.item;
                current = current.next;

                return item;
            }
        };
    }
}