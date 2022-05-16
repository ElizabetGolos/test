import java.util.Scanner;

public class CalculatorNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char calcOperation = 'c';
        double operand1;
        double operand2;
        char  operation;
        double result = 0;

        do {
            if (calcOperation == 'c') {
                System.out.println("Enter 1 operand");
                operand1 = scanner.nextInt();
                System.out.println("Enter operation");
                operation = scanner.next().charAt(0);
            } else {
                operand1 = result;
                operation = calcOperation;
            }
            System.out.println( "Enter 2 operand");
            operand2 = scanner.nextInt();

            result = calculate(operand1, operation, operand2);
            System.out.println("Result: " + result);

            System.out.println("Enter operation");
            calcOperation = scanner.next().charAt(0);

        } while (calcOperation != 's');
    }

    public static double calculate(double operand1, char operation,double operand2) {
        return switch (operation) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            default -> {
                System.out.println("Incorrect operation");
                yield 0;
            }
        };
    }
}



