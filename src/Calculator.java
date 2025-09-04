import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        int result;
        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = a - b;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = a * b;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }
}
