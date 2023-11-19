package tugas3;

import java.util.Scanner;

public class tugaspembagian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan jumlah nomor: ");
        int n = sc.nextInt();

        System.out.println("masukkan minimal nilai: ");
        int minVal = sc.nextInt();
        System.out.println("masukkan maksimal nilai: ");
        int maxVal = sc.nextInt();
        System.out.println("masukkan interval");
        int interval = sc.nextInt();

        if (maxVal-minVal<interval) {
            System.out.println("tidak valid");
        } else {
            int sum = 0;
            for (int i = 1;i<= n;i++) {
                sum += minVal;
                minVal += interval; }
            System.out.println("Sum = " + sum);
        }
    }
}
