package Sololearn;

import java.util.Scanner;

public class whileloops8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        int num = 1;
        while(num <= N){
            sum += num;
            num ++;
        }
        System.out.println(sum);
    }
}