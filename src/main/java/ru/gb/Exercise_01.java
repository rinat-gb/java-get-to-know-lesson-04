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

        System.out.println("Перевёрнутый список:");
        System.out.println(reverseList(list));
    }

    public LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> retList = (LinkedList) list.clone();

        for (int i = 0; i < retList.size() / 2; i++) {
            int tmp = retList.get(i);
            retList.set(i, retList.get(retList.size() - 1 - i));
            retList.set(retList.size() - 1 - i, tmp);
        }
        return retList;
    }
}
