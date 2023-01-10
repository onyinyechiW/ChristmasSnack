package ChristmasSnacks;

import java.util.Scanner;

public class SalesCalculationMain {
    public static void main(String[] args) {
        SalesCalculation salesCalculation = new SalesCalculation();
        Scanner input = new Scanner(System.in);
        SalesCalculation sales = new SalesCalculation();

        System.out.println("Welcome to product purchase");
        sales.userChoice();
        sales.calculateProductsPurchased();
        System.out.println(" press 1 to purchase again. \npress 2 to end");
        int option = input.nextInt();
        while (option != 2){
            sales.userChoice();

            System.out.println("press 1 to purchase again. \n  press 2 to end \n");
            option = input.nextInt();
        }

    }
}
