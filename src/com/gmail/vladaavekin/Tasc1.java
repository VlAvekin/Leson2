package com.gmail.vladaavekin;

//  Написать программу которая вычисляет частное двух чисел.
// Программа должна проверять правильность введенных пользователем данных и,
// если они неверные (делитель равен нулю), выдавать сообщение об ошибке.


import java.util.Scanner;

public class Tasc1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("a / b = c");

        System.out.print("Ведите a = ");
        int a = scanner.nextInt();
        System.out.print("Ведите b = ");
        int b = scanner.nextInt();
        double c ;

        if (b == 0) {
            System.out.println("деление на нулю невозможно");
        } else {
            c = (double) a / b;
            System.out.println(a + " / " + b + " = " + c);
        }

    }

}
