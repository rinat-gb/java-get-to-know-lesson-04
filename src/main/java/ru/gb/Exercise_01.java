package ru.gb;

import java.util.LinkedList;

/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
*/
public class Exercise_01 extends Exercise {
    public Exercise_01(String description) {
        super(description);
    }

    public void run() {
        super.run();

        LinkedList<Integer> list = buildList();

        System.out.println("Исходный список:");
        System.out.println(list);

        reverseList(list);

        System.out.println("Перевёрнутый список:");
        System.out.println(list);
    }

    public void reverseList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int tmp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, tmp);
        }
    }
}
