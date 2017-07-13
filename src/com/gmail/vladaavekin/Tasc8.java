package com.gmail.vladaavekin;

//  Дано трехзначное число. Определить, равен ли квадрат этого числа сумме
// кубов его цифр.

import java.util.Scanner;

public class Tasc8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ветите трехзначное число = ");
        String t = scanner.nextLine();
        int v = (int) Math.pow(Integer.parseInt(t), 2);

        String strArr[] = t.split("");

        int num = 0;
        for (int i = 0; i < strArr.length; i++) {
            //num += Math.pow(Integer.parseInt(strArr[i]), 3);
            num += Integer.parseInt(strArr[i]);
        }

        num = (int) Math.pow(num, 3);

        System.out.println(t + " ^2 = " + v);
        System.out.println(num);

        if(v == num) {
            System.out.println("Равен");
        } else {
            System.out.println("Не равен");
        }

    }

}
