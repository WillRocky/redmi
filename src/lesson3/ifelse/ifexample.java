package lesson3.ifelse;
import cratnost.BinaryOperators;
import cratnost.input;
import cratnost.log;
import cratnost.logic;

import java.util.Scanner;

public class ifexample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задачи :");
        System.out.println("0-BinaryOperators");
        System.out.println("1- logic");
        System.out.println("2- log");
        System.out.println("3- input");
        int tasknumber =  scanner.nextInt();

        if (tasknumber ==0) {
            BinaryOperators.main(args);
        }
        if (tasknumber ==1);{
            logic.main(args);
        }
        if (tasknumber ==2);{
            log.main(args);
        }
        if (tasknumber ==3);{
            input.main(args);
        }








    }
}
