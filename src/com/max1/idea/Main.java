package com.max.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Input 3 numbers:");
        int x = inp.nextInt();
        int y = inp.nextInt();
        int z = inp.nextInt();
        double r = (x + y + x);
        r/=3;

        System.out.printf("%f\n", r);
        int ri = (int) r;

        if (ri>3)
            System.out.println("Программа выполнена корректно");

        return;

    }
}