package com.pb.inikolaenko.hw3;

import java.util.Scanner;
import java.util.Random;

public class Bingo {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        Random random = new Random();


        int numUser;
        int attempt = 0;
        int number = random.nextInt(101);

        System.out.println("Игра ~УГАДАЙ ЧИСЛО~");
        System.out.println("Для выхода из игры введите - 777.");





            while (true) {
                attempt++;
                System.out.print("Попытка №" + attempt + ":");

                numUser = scan.nextInt();

                if (numUser == 777) {
                    break;

                }

                if (numUser != number) {
                    if (numUser>number) {
                        System.out.println("Неправильно! Число должно быть меньше!");
                    }else{
                        System.out.println("Неправильно! Число должно быть больше!");
                    }
                    continue;
                }

                System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                break;
            }

            System.out.println("Конец игры!");
        }
    }


