package org;

import java.util.Scanner;

public class ConsoleMenu {
    public int getSelection() {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Для продолжение выберете следующее:");
        System.out.println("-------------------------\n");
        System.out.println("1 - Введите диапазон чисел");
        System.out.println("2 - Выход из программы");

        selection = input.nextInt();

        return selection;
    }
}