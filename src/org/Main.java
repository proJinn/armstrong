package org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        // TODO: Реализовать меню работы с пользователем
        // TODO: Реализовать вывод сообщений о запросе и прием результатов запроса
   
        // TODO: Запросить у пользователя

        ConsoleMenu consoleMenu = new ConsoleMenu();
        int selection = consoleMenu.getSelection();

        switch (selection) {
            case 1: {
                Scanner input = new Scanner(System.in);
                int min;
                int max;
                do {
                    System.out.println("Введите минимальное положительное число:");
                    while (!input.hasNextInt()) {
                        System.out.println("Это не число!");
                        input.next(); // this is important!
                    }
                    min = input.nextInt();
                } while (min < 0);

                do {
                    System.out.println("Введите максимальное положительное число:");
                    while (!input.hasNextInt()) {
                        System.out.println("Это не число!");
                        input.next(); // this is important!
                    }
                    max = input.nextInt();
                } while (max <= min);

                for (int i = min; i < max; ++i) {
                    Armstrong armstrong = new Armstrong(i);

                    if (armstrong.getResult()) {
                        System.out.println(i + " - Число Армстронга");
                    }
                }

                break;
            }
            case 2: {
                System.exit(0);
                break;
            }
        }



    }
}