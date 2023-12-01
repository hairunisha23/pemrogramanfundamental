package kuiz1;

    import java.util.Scanner;
    public class kuiz1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Inputkan nilai");
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();
            double hasil = (a+b+c)/3;
            System.out.println("Rata-Rata :"+ hasil);
        }
    }

