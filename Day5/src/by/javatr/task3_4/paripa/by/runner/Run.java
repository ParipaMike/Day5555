package by.javatr.task3_4.paripa.by.runner;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("¬ведите текст");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();


        text = text.replaceAll("[ \t\n\r]+", " ");


        text = text.replaceAll("[^a-zA-Zа-€ј-я ]", " ");



        for(int i = 0; i < text.length(); i++)
        {
            System.out.print(text.charAt(i)+" ");
        }

    }
}
