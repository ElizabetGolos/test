import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        float operand2 = scanner.nextInt();
        if (operation == '+') {
            System.out.print(operand1 + operand2);
        }
        if (operation == '-') {
            System.out.println(operand1 - operand2);
        }
        if (operation == '*'){
            System.out.println(operand1 * operand2);
        }
        if (operation == '/') {
            System.out.println(operand1 / operand2);

        }
    }
}