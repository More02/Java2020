package ru.more02.ex26.task2;

public abstract class AbstractQueue implements Queue {

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }
    
}