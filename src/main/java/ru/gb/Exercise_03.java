package ru.gb;

import java.util.Iterator;
import java.util.LinkedList;

/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
*/
public class Exercise_03 extends Exercise {
    public Exercise_03(String description) {
        super(description);
    }

    public void run() {
        super.run();

        LinkedList<Integer> list = buildList();

        System.out.println("Исходный список:");
        System.out.println(list);

        int sum = 0;
        Iterator<Integer> it = list.iterator();

        System.out.print("[");
        boolean fNotFirstNum = false;

        while (it.hasNext()) {
            if (fNotFirstNum) {
                System.out.print(" + ");
            } else {
                fNotFirstNum = true;
            }
            int elementValue = it.next();
            sum += elementValue;
            System.out.printf("%d", elementValue);
        }
        System.out.printf("] = %d\n", sum);
    }
}
