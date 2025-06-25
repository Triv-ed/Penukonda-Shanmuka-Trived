package assign;

import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

  
    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase(); 
    }

   
    public void calculate() {
        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation. Use add, subtract, multiply, or divide.");
        }
    }
}

public class Problem_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        scanner.nextLine(); 
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.nextLine();

        
        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();

        scanner.close();
	}

}
