package practic2;
import java.util.Scanner;
public class practic2 {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        System.out.println("У нас есть прямоугольника у которого нужно найти площадь :");
        System.out.print("Ширина прямоугольника - ");
        float a = scanner.nextFloat();
        System.out.print("Висота прямоугольника - ");
        float b = scanner.nextFloat();
        float x;
        x= a*b;
        System.out.println("Площадь прямоугольника будет равна = " + x +";");






    }
}
