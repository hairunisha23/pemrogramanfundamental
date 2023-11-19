package Sololearn;

import java.util.Scanner;

public class arrays3 {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Expresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        if(choise==0){
            System.out.println(menu[0]);
        }else if(choise==1){
            System.out.println(menu[1]);
        }else if(choise==2){
            System.out.println(menu[2]);
        }else if(choise==3){
            System.out.println(menu[3]);
        }else if(choise==4){
            System.out.println(menu[4]);
        }else if(choise==5){
            System.out.println(menu[5]);
        } else {
            System.out.println("Invalid");
        }
    }
}