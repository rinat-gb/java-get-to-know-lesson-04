package ru.gb;

import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    /*
     * enqueue() - помещает элемент в конец очереди
     */
    public void enqueue(T element) {
        queue.addLast(element);
    }

    /*
     * dequeue() - возвращает первый элемент из очереди и удаляет его
     */
    public T dequeue() {
        T retVal = this.first();
        queue.remove(0);
        return retVal;
    }

    /*
     * first() - возвращает первый элемент из очереди, не удаляя.
     */
    public T first() {
        return queue.getFirst();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}

