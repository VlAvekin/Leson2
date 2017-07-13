package com.gmail.vladaavekin;

//  Написать программу, которая проверяет, является ли введённое
// пользователем целое число четным. Ниже приведён возможный вид экрана
// программы во время выполнения такой программы (Данные, вводимые
// пользователем, выделены полужирным шрифтом).

import java.util.Scanner;

public class Tasc4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите число = ");
        int a = scanner.nextInt();

        if (a % 2 == 1) {
            System.out.println("Число " + a + " — нечетное.");
        } else {
            System.out.println("Число " + a + " — четное.");
        }

    }

}
