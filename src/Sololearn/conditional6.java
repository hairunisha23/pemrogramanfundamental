package Sololearn;

import java.util.Scanner;

public class conditional6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sample = sc.nextInt();
        if(sample>=100) {
            System.out.println("Boiling");
        } else {
            System.out.println("Not boilinng");
        }
    }
}