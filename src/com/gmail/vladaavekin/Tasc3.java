package com.gmail.vladaavekin;

//  Написать программу для вычисления стоимости покупки с учетом скидки.
// Скидка в 3% предоставляется, если сумма покупки больше 500 руб, в 5% — если
// сумма больше 1000 руб. Ниже приведён возможный вид экрана во время
// выполнения такой программы (Данные, вводимые пользователем, выделены
// полужирным шрифтом).

import java.util.Scanner;

public class Tasc3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите сумму покупки = ");
        double a = scanner.nextInt();

        if (a < 500 && a >= 0) {

            System.out.println("Вычисление стоимости покупки \n" + a);


        } else if ( a <= 500 && a < 1000 && a > 0) {

            System.out.println("Вычисление стоимости покупки с учетом скидки. \n" + a);
            System.out.println("Вам предоставляется скидка 3%");
            System.out.println("Сумма с учетом скидки: " + (a - (a * 0.03)) + " грн.");

        } else if (a >= 1000){

            System.out.println("Вычисление стоимости покупки \n" + a);
            System.out.println("Вам предоставляется скидка 5%");
            System.out.println("Сумма с учетом скидки: " + (a - (a * 0.05)) + " грн.");

        } else {
            System.out.println("Не верная сумма");
        }

    }

}
