package Sololearn;

import java.util.Scanner;
class parameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        convert(num);
    }

    static void convert(double num) {
        System.out.println(num * 12);
    }
}