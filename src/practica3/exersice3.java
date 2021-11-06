package practica3;
import java.util.Scanner;
public class exersice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            System.out.println("Reversed Number: " + reversed);
        }
        int num2 = scanner.nextInt(), reverce = 0;
        while(num2 != 0) {
            int dig = num2 % 10;
            reversed = reversed * 10 + dig;
            System.out.println("revers:"+ reverce);

        }
    }
}


