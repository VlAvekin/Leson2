package com.gmail.vladaavekin;

// Дано трехзначное число. Определить, какая из его цифр больше:
// а) первая или последняя;
// б) первая или вторая;
// в) вторая или последняя.

import java.util.Scanner;

public class Tasc7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ветите трехзначное число = ");
        String t = scanner.nextLine();

        String strArr[] = t.split("");

        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        int c = max(numArr);

        System.out.println("max = " + c);


    }

    public static int max(final int a[]) {

        int m;
         if (a[0] > a[1] && a[0] > a[2]) {
             m = a[0];
         } else if (a[1] > a[0] && a[1] > a[2]) {
             m = a[1];
         } else {
             m = a[2];
         }
        return m;
    }

}
