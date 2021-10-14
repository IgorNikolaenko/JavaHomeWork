package com.pb.inikolaenko.hw2;
import java.util.Scanner;
public class Interval {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Введите число: ");
        num = scan.nextInt();

        if (num >= 0 && num <= 14) {
            System.out.print("Число в промежутке от 0 до 14.");
        } else if (num >= 15 && num <= 35) {
            System.out.print("Число в промежутке от 15 до 35.");
        } else if (num >= 36 && num <= 50) {
            System.out.print("Число в промежутке от 36 до 50.");
        } else if (num >= 51 && num <= 100) {
            System.out.print("Число в промежутке от 51 до 100.");
        } else {
            System.out.print("Число вне заданых промежутков.");
        }
    }
}