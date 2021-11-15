package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isBreak = false;
        while (!isBreak) {

            System.out.print("Введите номер рекурсии (9-12) (0 - для выхода): ");
            int num = in.nextInt();

            switch (num) {

                case 9:
                    System.out.println("Номер 9:\n" + recursion9(3, 2));
                    break;
                case 10:
                    System.out.println("Номер 10:\n" + recursion10(345, 6));
                    break;
                case 11:
                    System.out.println("Номер 11:\n" + recursion11());
                    break;
                case 12:
                    System.out.println("Номер 12:\n");
                    recursion12();
                    break;
                default:
                    System.out.println("Выход из программы...");
                    isBreak = true;
            }
        }
    }

    public static int recursion9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursion9(a, b - 1) + recursion9(a - 1, b - 1);
    }

    public static int recursion10(int n, int i) {
        return (n==0) ? i : recursion10( n/10, i*10 + n%10 );
    }

    public static int recursion11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return recursion11() + n + m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return recursion11() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return recursion11() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static void recursion12() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                recursion12();
            } else {
                recursion12();
            }
        }
    }
}

