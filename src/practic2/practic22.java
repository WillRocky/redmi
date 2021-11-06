package practic2;
import java.util.Scanner;
public class practic22 {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        System.out.println("У нас есть прямоугольника у которого нужно найти площадь :");
        float a = scanner.nextFloat();
        System.out.println("Ширина прямоугольника - "+ a);
        float b = scanner.nextFloat();
        System.out.println("Висота прямоугольника - "+ b);
        float S = a * b;
        System.out.println();
        System.out.println("Площадь прямоугольника будет равна = " + S);






    }
}
