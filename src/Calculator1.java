import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chiclo:");
        float operand1 = scanner.nextInt();
        System.out.println("Vvedite operaciu:");
        char operation = scanner.next().charAt(0);
        System.out.println("Vvedite chislo:");
        float operand2 = scanner.nextInt();
        switch (operation) {
            case '+' -> System.out.println("result: " + (operand1 + operand2));
            case '-' -> System.out.println("result: " + (operand1 - operand2));
            case '*' -> System.out.println("result: " + (operand1 * operand2));
            case '/' -> System.out.println("result: " + (operand1 / operand2));
            default -> System.out.println("ne verny vvod");
        }
    }
}
