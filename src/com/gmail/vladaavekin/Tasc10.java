package com.gmail.vladaavekin;

// Написать программу решения уравнения ax3 + bх = 0 для произвольных а, b.

import java.util.Scanner;

public class Tasc10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициенты для квадратного уравнения (ax^3 + bx = 0):");

        System.out.print("a = ");
        double a = scanner.nextInt();

        System.out.print("b = ");
        double b = scanner.nextInt();

        double x;

        if (b > 0) {
            System.out.println("x = 0" );
        } else {
            System.out.println("x1 = 0" );

            x = Math.sqrt(b/(-a));
            System.out.println("x1 = " + x);
        }

    }

}
