package org.example.task4;
/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        double average = (double) sum / numbers.size();

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + average);


    }
}
