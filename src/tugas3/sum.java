package tugas3;


import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Minimum = ");
        int minVal = scanner.nextInt();

        System.out.println("Maximum = ");
        int maxVal = scanner.nextInt();

        System.out.println("interval = ");
        int interval = scanner.nextInt();

        if (maxVal - minVal < interval) {
            System.out.println("Invalid interval");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += minVal;
                minVal += interval;
            }
            System.out.println("Sum = " + sum);
        }
    }
}

