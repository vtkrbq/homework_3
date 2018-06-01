package com.rudnev.homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Hater {
    private static String hate(String s) {
        //создаем массив char для строки с именем
        char[] originalName = new char[s.length()];
        //создаем генератор случайной буквы
        char rc = (char)('A' + new Random().nextInt(26));
        //создамем генератор случайной цифры для замены буквы
        Random randomInt = new Random();
        int random = randomInt.nextInt(s.length());
        //переводим строку с именем в массив char
        int i = 0;
        for (char letter : s.toCharArray()) {
            originalName[i] = letter;
            i++;
        }
        //меняем случайную букву в имени на другую случайную букву
        for (int j = 0; j < s.length(); j++) {
            if (j == random) {
                originalName[j] = rc;
            }
        }
        //создаем и выводим строку с измененным именем
        String changedName = new String(originalName);
        return changedName;
    }
    public static void main(String[] args) throws IOException {
        //вводим имя с клавиатуры и выводим его на экран
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя и фамилию человека, которого Вы ненавидите: ");
        String originalName = reader.readLine();
        System.out.print("Оригинальное имя: ");
        System.out.println(originalName);
        //выводим на экран 10 вызовов метода hate класса Hater
        for (int i = 1; i <= 10; i++) {
            System.out.print("Измененное имя №" + i + ": ");
            System.out.println(Hater.hate(originalName));
        }
    }
}
