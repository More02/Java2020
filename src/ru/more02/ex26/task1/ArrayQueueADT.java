package ru.more02.ex26.task1;


public class ArrayQueueADT {
    private int head = 0;
    private int tail = 0;
    private Object[] elements = new Object[16];

    private static void ensureCapacity(ArrayQueueADT queue, int size) {
        if (size == queue.elements.length || (size > 3 && size == queue.elements.length / 4)) {
            Object[] newElements;
            if (size == queue.elements.length) {
                newElements = new Object[queue.elements.length * 2];
            } else {
                newElements = new Object[queue.elements.length / 2];
            }
            if (queue.head <= queue.tail) {
                System.arraycopy(queue.elements, queue.head, newElements, 0, size(queue));
            } else {
                System.arraycopy(queue.elements, queue.head, newElements, 0, queue.elements.length - queue.head);
                System.arraycopy(queue.elements, 0, newElements, queue.elements.length - queue.head, queue.tail);
            }
            queue.tail = size(queue);
            queue.head = 0;
            queue.elements = newElements;
        }
    }

    public static void enqueue(ArrayQueueADT queue, Object element) { // добавить элемент в очередь
        ensureCapacity(queue, size(queue) + 1);
        queue.elements[queue.tail] = element;

        queue.tail = (queue.tail + 1) % queue.elements.length;
    }

    public static Object element(ArrayQueueADT queue) { // первый элемент в очереди
        assert !isEmpty(queue);

        return queue.elements[queue.head];
    }


    public static Object dequeue(ArrayQueueADT queue) { //удалить и вернуть первый элемент в очереди
        assert !isEmpty(queue);
        ensureCapacity(queue, size(queue) - 1);

        Object r = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        return r;
    }

    public static int size(ArrayQueueADT queue) { // текущий размер очереди
        return queue.tail - queue.head + (queue.head > queue.tail ? queue.elements.length : 0);
    }


    public static boolean isEmpty(ArrayQueueADT queue) { // является ли очередь пустой
        return queue.head == queue.tail;
    }

    public static void clear(ArrayQueueADT queue) { // удалить все элементы из очереди
        while (!isEmpty(queue)) {
            dequeue(queue);
        }
    }


}