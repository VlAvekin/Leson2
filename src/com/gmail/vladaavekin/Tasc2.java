package com.gmail.vladaavekin;

//  Написать программу для проверки знания даты основания Одессы. В случае
// неправильного ответа пользователя, программа должна выводить правильный
// ответ. Ниже приведён возможный вид экрана во время выполнения такой
// программы (Данные, вводимые пользователем, выделены полужирным шрифтом).


import java.util.Scanner;

public class Tasc2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("В каком году была основана Одесса?");

        int a = scanner.nextInt();

        if(a == 1794) {
            System.out.println("Верно, Одесса была основана в 1794 году.");
        } else {
            System.out.println("Вы ошиблись, Одесса была основана в 1794 году.");
        }

    }

}
