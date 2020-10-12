package ru.more02.ex26.task2;

public interface Queue {

    void enqueue(Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
}