package com.pb.inikolaenko.hw2;
import java.util.Scanner;
public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;

        String operation;

        System.out.print("Введите первое число: ");
        num1 = scan.nextInt();

        System.out.print("Введите операцию: ");
        operation = scan.next();

        System.out.print("Введите второе число: ");
        num2 = scan.nextInt();

        switch (operation) {
            case "+":
                System.out.println("Результат: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Результат: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Результат: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.print("На 0 делить нельзя!");
                } else {
                    System.out.println("Результат: " + (num1 / num2));
                    break;
                }
        }
    }
}

