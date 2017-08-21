import java.util.Scanner;

public class Main

    {
        public static void main(String[] args)
        {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        Double operand1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter 2nd Number: ");
        Double operand2 = Double.parseDouble(scanner.nextLine());
        double sum = operand1 + operand2;
        double divide = operand1 / operand2;
        double multiply = operand1 * operand2;
        double subtract = operand1 - operand2;
        double remainder = operand1 % operand2;
        showResults(sum, subtract, divide, multiply, remainder);
    }
    public static void showResults(double sum, double subtract, double divide, double multiply, double remainder)
    {
        System.out.println("result of numbers added = " + sum);
        System.out.println("result of numbers subtracted = " + subtract);
        System.out.println("result of numbers divided = " + divide);
        System.out.println("result of  numbers multiplied = " + multiply);
        System.out.println("remainder of both numbers = " + remainder);

    }
    }

