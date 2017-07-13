package com.gmail.vladaavekin;

//  Написать программу, которая проверяет, делится ли на три введённое с
// клавиатуры целое число. Ниже приведён возможный вид экрана программы во
// время её работы (Данные, вводимые пользователем, выделены полужирным
// шрифтом).

import java.util.Scanner;

public class Tasc5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите число = ");
        int a = scanner.nextInt();

        double b = (double) a / 3;

        if (b % 1 == 0) {
            System.out.println("Число " + a + " делится на три нацело.");
        } else {
            System.out.println("Число " + a + " нацело на три не делится.");
        }

    }

}
