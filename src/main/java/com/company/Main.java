package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start; //сохраняет время начала теста
        long end; //сохраняет время конца теста

        System.out.println("|Function       |ArrayList           |LinkedList          | \n" +
                "|---------------|--------------------|--------------------|");

        System.out.print("|add            |"); // тестируем функцию добавления

        start = System.nanoTime();
        for(int i = 0; i < 2000; i++)
            arrayList.add(i);
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.print("|");

        start = System.nanoTime();
        for(int i = 0; i < 2000; i++)
            linkedList.add(i);
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");

        System.out.print("|remove(first)  |"); //тестируем удаления первого элемента

        start = System.nanoTime();
        for(int i = 0; i < 2000; i++)
            arrayList.remove(0);
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.print("|");

        start = System.nanoTime();
        for(int i = 0; i < 2000; i++)
            linkedList.remove(0);
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");

        for(int i = 0; i < 2000; i++) // добаляем элементы для удаления
            arrayList.add(i);
        for(int i = 0; i < 2000; i++)
            linkedList.add(i);

        System.out.print("|remove(last)   |"); // тестируем удаление последнего элемента

        start = System.nanoTime();
        for(int i = 1999; i >= 0; i--)
            arrayList.remove(i);
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.print("|");

        start = System.nanoTime();
        for(int i = 1999; i >= 0; i--)
            linkedList.remove(i);
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");

        for(int i = 0; i < 4000; i++) // добавлем элементы для удаления. 4000 - чтобы можно было удалить 2000 элементов из середины
            arrayList.add(i);
        for(int i = 0; i < 4000; i++)
            linkedList.add(i);

        System.out.print("|remove(center) |"); // тестируем удаление из середины

        start = System.nanoTime();
        for(int i = 0; i < 2000; i++)
            arrayList.remove(2000 - i/2);
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.print("|");

        start = System.nanoTime();
        for(int i = 0; i < 2000; i++)
            linkedList.remove(2000 - i/2);
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");

        System.out.print("|get            |"); // тестируем получение элемента с каждой позиции

        start = System.nanoTime();
        for(int i = 0; i < 2000; i++)
            arrayList.get(i);
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.print("|");

        start = System.nanoTime();
        for(int i = 0; i < 2000; i++)
            linkedList.get(i);
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");

        System.out.print("|clear          |"); // тестируем очистку от всех элементов

        start = System.nanoTime();
        arrayList.clear();
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.print("|");

        start = System.nanoTime();
        linkedList.clear();
        end = System.nanoTime();

        System.out.printf("%20d", end - start);
        System.out.println("|");
        System.out.println("|---------------|--------------------|--------------------|");
    }
}