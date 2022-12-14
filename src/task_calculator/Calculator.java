package task_calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            System.out.println("Введіть перше ціле число: ");
            int operand1 = in.nextInt();

            System.out.println("Введіть друге ціле число: ");
            int operand2 = in.nextInt();

            System.out.println("Введіть дію: ");
            String sign = in.next();

            switch (sign) {
                case "+":
                    add(operand1, operand2);
                    break;
                case "-":
                    sub(operand1, operand2);
                    break;
                case "*":
                    mul(operand1, operand2);
                    break;
                case "/":
                    div(operand1, operand2);
                    break;
                default:
                    System.out.println("Я не зрозумів дію :(");
            }
        }
        catch (Exception e) {
            System.out.println("Ви ввели не ціле число!");
            System.out.println(e.getMessage());
        }
        }
    static void add(int a, int b){
            int result;
            try {
                result = a + b;
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.out.println("Виключення: ");
                System.out.println(e.getMessage());
            }
    }
    static void sub(int a, int b){
            int result;
            try {
                result = a - b;
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.out.println("Виключення: ");
                System.out.println(e.getMessage());
            }
    }
    static void mul(int a, int b){
            int result;
            try {
                result = a * b;
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.out.println("Виключення: ");
                System.out.println(e.getMessage());
            }
    }
    static void div(int a, int b){
        int result;
        try {
            result = a / b;
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Виключення: ");
            System.out.println(e.getMessage());
        }
    }
}
