package tugas3;

import java.util.Scanner;

public class tiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Umur: ");
        int age = sc.nextInt();

        if (age >= 0 && age <= 12){
            System.out.println("Harga Tiket: Rp.10.000");
        } else if (age >= 13 && age <= 18){
            System.out.println("Harga Tiket: Rp.25.000");
        } else if (age >= 18 && age <= 40){
            System.out.println("Harga Tiket: Rp.75.000");
        } else {
            System.out.println("Dilarang Berenang");
        }
    }
}
