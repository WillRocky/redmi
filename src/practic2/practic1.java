package practic2;
import java.util.Scanner;
public class practic1 {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        System.out.print("Введите число а = ");
        float a = scanner.nextFloat();
        System.out.print("Введите число b = ");
        float b =scanner.nextFloat();
        System.out.print("Соответственно ответ будет : ");
        float x = (a + b);
        System.out.println(x);
        System.out.println("Спасибо!");
    }
}
