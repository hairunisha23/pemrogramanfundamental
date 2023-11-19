package tugas5;

public class dowhile1 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        }
        while (i <= 100) ;
        System.out.println("The sum of the numbers from 1 to 100 is: " + sum);
    }
}
