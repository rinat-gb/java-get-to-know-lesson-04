/*
Урок 4. Хранение и обработка данных ч1: приоритетные коллекции

1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

2. Реализуйте очередь с помощью LinkedList со следующими методами:

enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.

3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
*/
package ru.gb;

public class App 
{
    public static void main( String[] args )
    {
        Lesson lesson = new Lesson_04("Урок 4. Хранение и обработка данных ч1: приоритетные коллекции");

        while (true) {
            int choice = lesson.menu();

            if (choice == -1)
                break;

            System.out.printf("Задание номер %d\n", choice + 1);
            System.out.println("===============");

            lesson.runExercise(choice);
            waitForEnter();
        }
    }

    private static void waitForEnter() {
        System.out.print("\nНажмите Enter для продолжения...");

        try {
            System.in.skip(System.in.available());
            System.in.read();
        } catch (Exception e) {
        }
        System.out.println();
    }
}
