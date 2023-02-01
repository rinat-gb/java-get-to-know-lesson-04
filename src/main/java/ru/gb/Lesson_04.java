package ru.gb;

public class Lesson_04 extends Lesson {
    public Lesson_04(String title) {
        super(title);

        addExercise(new Exercise_01(
                "Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список."));

        addExercise(new Exercise_02("Реализуйте очередь с помощью LinkedList со следующими методами:\n" +
                "\n" +
                "enqueue() - помещает элемент в конец очереди,\n" +
                "dequeue() - возвращает первый элемент из очереди и удаляет его,\n" +
                "first() - возвращает первый элемент из очереди, не удаляя."));

        addExercise(new Exercise_03(
                "Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор"));
    }
}
