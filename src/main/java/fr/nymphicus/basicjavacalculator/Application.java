package fr.nymphicus.basicjavacalculator;

import java.util.Scanner;

public class Application {

    /**
     * Handle the user interface for the calculator.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==========BasicJavaCalculator=========");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square root");
            System.out.println("7. Stop");
            System.out.print("Choose an operation : ");

            int choice = scanner.nextInt();
            if ( choice < 1 || choice > 7) {
                System.out.println("Invalid choice.");
            }

            double a=0.0,b=0.0;
            double result;

            if (choice == 7) {
                System.out.println("End of program.");
                scanner.close();
                return;
            }

            System.out.print("First operand : ");
            a = scanner.nextDouble();
            if (choice != 6)
            {
                System.out.print("Second operand : ");
                b = scanner.nextDouble();
            }

            
            switch (choice) {
                case 1:
                    result = Calculator.addition(a,b);
                    System.out.println("Addition result : " + result);
                    break;
                case 2:
                    result = Calculator.substraction(a,b);
                    System.out.println("Substraction result : " + result);
                    break;
                case 3:
                    result = Calculator.multiplication(a,b);
                    System.out.println("Multiplication result : " + result);
                    break;
                case 4:
                    try {
                        result = Calculator.division(a,b);
                        System.out.println("Division result : " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Dividing by zero. Error.");
                    }
                    break;
                case 5:
                    result = Calculator.power(a,b);
                    System.out.println("Power result : " + result);
                    break;
                case 6:
                    result = Calculator.sqrt(a);
                    System.out.println("Square root result : " + result);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}