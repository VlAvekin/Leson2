package com.gmail.vladaavekin;

//  Даны вещественные числа х и у, не равные друг другу. Меньшее из этих
// двух чисел заменить половиной их суммы, а большее — их удвоенным
// произведением.

import java.util.Scanner;

public class Tasc9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        double y = scanner.nextDouble();

        final double mini = min(x, y);

        System.out.println("x = " );
    }

    public static double min(final double c, final double v){

        double m;

        if (c < v) {
            m = c;
        } else {
            m = v;
        }

        return m;
    }

}
