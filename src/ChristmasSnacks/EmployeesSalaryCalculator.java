package ChristmasSnacks;

import java.util.Scanner;

public class EmployeesSalaryCalculator {

    public EmployeesSalaryCalculator(){

    }
        public void EmployeeSalary(){
            Scanner stella = new Scanner(System.in);
            int counter = 1;
            while (counter <= 3) {

                System.out.println("Enter hour worked: ");
                int hourWorked = stella.nextInt();

                System.out.println("Enter hourly pay rate: ");
                int hourlyPayRate = stella.nextInt();

                System.out.println("Enter excess hour worked: ");
                int hourExcessWorked = stella.nextInt();

                double grossPay = hourWorked * hourlyPayRate;
                double overtime = 1.5 * hourExcessWorked * hourlyPayRate;

                System.out.println("gross pay is:" + grossPay);
                System.out.println("overtime is:" + overtime);


                counter++;

            }

        }
    }