package lesson3.ifelse;

import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //строка из 5 символов  -джекпот
        //строка из 3 символов  -провал
        int length = str.length();
        System.out.println("Длина строки = " + length);
        if (length == 5) {
            System.out.println("ДЖЕКПОТ!!!");
        } else if (length == 3)  {
            System.out.println("Провал :(");
        }
    }
}