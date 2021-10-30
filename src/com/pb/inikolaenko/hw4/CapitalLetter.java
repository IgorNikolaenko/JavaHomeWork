package com.pb.inikolaenko.hw4;

import java.util.Scanner;

public class CapitalLetter {




         public static String toTitleCase(String input) {
             String result = "";
             String[] words = input.split(" ");

             for (int i = 0; i < words.length; i++) {
                 result += words[i].replaceFirst(words[i].charAt(0) + "", Character.toUpperCase(words[i].charAt(0)) + "") + " ";
             }

             return result;
         }
           public static void main (String[]args) {

        Scanner scan = new Scanner(System.in);
        String input;
        String result;
        System.out.println("Введите текст: ");

        input = scan.nextLine();


        result = toTitleCase(input);

               System.out.println("Результат: " +result);
        }

    }


