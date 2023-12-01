package tugas4;

import java.util.Scanner;

public class konversi1if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf: ");
        String nilaiHuruf = input.nextLine().toUpperCase();

        double nilaiIndeks;

        if (nilaiHuruf.equals("A")) {
            nilaiIndeks = 4.0;
        } else if (nilaiHuruf.equals("B")) {
            nilaiIndeks = 3.0;
        } else if (nilaiHuruf.equals("C")) {
            nilaiIndeks = 2.0;
        } else if (nilaiHuruf.equals("D")) {
            nilaiIndeks = 1.0;
        } else if (nilaiHuruf.equals("E")) {
            nilaiIndeks = 0.0;
        } else {
            System.out.println("Huruf tidak valid");
            return;
        }

        System.out.println("Nilai indeks: " + nilaiIndeks);
    }
}
