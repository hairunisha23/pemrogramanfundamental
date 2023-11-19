package Sololearn;

import java.util.Scanner;

public class multidimensional4 {
    public static void main(String[] args){
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        String status[] = {"Free", "Sold"};
        int row = sc.nextInt();
        int col =sc.nextInt();
        System.out.println(status[seats[row][col]]);
    }
}