package com.gmail.vladaavekin;

//  Написать программу для вычисления стоимости разговора по телефону с
// учетом 20% скидки, предоставляемой по субботам и воскресеньям. Ниже
// приведён возможный вид экрана программы во время её работы (Данные,
// вводимые пользователем, выделены полужирным шрифтом).

import java.util.Scanner;

public class Tasc6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Вычисление стоимости разговора по телефону.");
        System.out.println("Введите исходные данные:");

        System.out.print("Длительность разговора (целое количество минут) = ");
        int a = scanner.nextInt();

        System.out.print("День недели (1 — понедельник, ... 7 — воскресенье) = ");
        int b = scanner.nextInt();

        int c = a * 2;

        if (b <= 5) {

            System.out.print("Стоимость разговора: " + c);

        } else if (b == 6 || b == 7) {

            System.out.println("Предоставляется скидка 20%.");
            System.out.println("Стоимость разговора: " + (c - (c * 0.2)) );

        } else {
            System.out.println("Неверный день");
        }

    }

}
