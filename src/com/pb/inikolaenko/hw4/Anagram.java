package com.pb.inikolaenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = in.nextLine().toUpperCase();


        System.out.print("Enter second string: ");
        String second = in.nextLine().toUpperCase();

        String result = isAnagram(first, second);
        System.out.println(result);
    }

    private static String isAnagram(String first, String second) {
        if (first == null || second == null || first.equals("") || second.equals("") || !first.matches("[-А-Яа-я,. ]+")
                || !second.matches("[-А-Яа-я,. ]+")) {
            return "No anagram.";
        }
        String answer = "";

        String st = first.replaceAll("[^\\da-zA-Za-яёА-ЯЁ]","");
        String nd = second.replaceAll("[^\\da-zA-Za-яёА-ЯЁ]","");

        if (st.equals("") || nd.equals("")) {
            return "No anagram.";
        }

        char[] arraySt = st.toCharArray();
        char[] arrayNd = nd.toCharArray();
        Arrays.sort(arraySt);
        Arrays.sort(arrayNd);

        if (Arrays.equals(arraySt, arrayNd)) {
            answer = "Anagram.";
        } else {
            answer = "No anagram.";
        }
        return answer;

    }
}