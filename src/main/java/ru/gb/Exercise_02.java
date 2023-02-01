package ru.gb;

import java.util.Random;

/*
Реализуйте очередь с помощью LinkedList со следующими методами:

enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
*/
public class Exercise_02 extends Exercise {
    private static final int MAX_RND = 100;
    private static final int NUM_OF_ITERATIONS = 5;

    public Exercise_02(String description) {
        super(description);
    }

    public void run() {
        super.run();

        MyQueue<Integer> myQueue = new MyQueue<>();

        System.out.printf("Состояние очереди: %s\n", myQueue.toString());
        System.out.println();

        Random rnd = new Random();

        for (int i = 0; i < NUM_OF_ITERATIONS; i++) {
            int element = rnd.nextInt(MAX_RND);
            System.out.printf("Добавляем: %d\n", element);
            myQueue.enqueue(element);
            System.out.printf("Состояние очереди: %s\n", myQueue.toString());
        }
        System.out.println();

        System.out.printf("Первый элемент в очереди без его удаления: %d\n", myQueue.first());
        System.out.printf("Состояние очереди: %s\n", myQueue.toString());
        System.out.printf("Первый элемент в очереди без его удаления: %d\n", myQueue.first());
        System.out.printf("Состояние очереди: %s\n\n", myQueue.toString());

        for (int i = 0; i < NUM_OF_ITERATIONS; i++) {
            System.out.printf("Удаляем первый элемент из очереди: %d\n", myQueue.dequeue());
            System.out.printf("Состояние очереди: %s\n", myQueue.toString());
        }
        System.out.println();
    }
}
