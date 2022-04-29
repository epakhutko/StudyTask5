package com.max.idea;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Input 3 numbers:");
        double x = inp.nextDouble();
        double y = inp.nextDouble();
        double z = inp.nextDouble();
        double r= (x + y + z) / 3;
        System.out.printf("average: %f\n", r);
        r/=2;
        int ri = (int) r;

        if (ri>3)
            System.out.println("Программа выполнена корректно");

        return;

    }
}