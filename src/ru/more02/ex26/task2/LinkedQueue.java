package ru.more02.ex26.task2;


public class LinkedQueue extends AbstractQueue {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public void enqueue(Object element) {
        Node n = new Node(element);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = tail.next;
        }
        size++;
    }

    public Object element() {
        assert !isEmpty();

        return head.value;
    }

    public Object dequeue() {
        assert !isEmpty();

        Node n = head;
        head = head.next;
        size--;
        return n.value;
    }

    public int size() {
        return size;
    }

}