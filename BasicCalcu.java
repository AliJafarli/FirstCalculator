import java.util.Scanner;

public class BasicCalcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstValue, secondValue, result = 0;
        char operator, choice = 'y';
        while (choice == 'y'){
            System.out.println("Введите число: ");
            firstValue = sc.nextDouble();
            System.out.println("Введите команду(+,-,*,/,%,^): ");
            operator = sc.next().charAt(0);
            System.out.println("Введите число: ");
            secondValue = sc.nextDouble();
            switch (operator){
                case '+':
                    result = firstValue + secondValue;
                    break;
                case '-':
                    result = firstValue - secondValue;
                    break;
                case '*':
                    result = firstValue * secondValue;
                    break;
                case '/':
                    result = firstValue / secondValue;
                    break;
                case '%':
                    result = firstValue % secondValue;
                    break;
                case '^':
                    result = Math.pow(firstValue, secondValue);
                    break;
                default:
                    System.out.println("\nWrong command");
                    System.exit(0);
            }
            System.out.println("\n" + firstValue + " " + operator + " " + secondValue + " = " + result);
            System.out.println("Continue?(y / n): ");
            choice = sc.next().charAt(0);
            System.out.println();

        }
    }
}