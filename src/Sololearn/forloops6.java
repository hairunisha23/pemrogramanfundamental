package Sololearn;

import java.util.Scanner;

class forloops6 {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =1;
        for(int x=1; x<=num; x++){
            sum*=x;
        }
        System.out.println(sum);
    }
}