package cratnost;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String userName = scanner.nextLine();
        System.out.print("Введите Х :");
        int x = scanner.nextInt();

        System.out.println("Спасибо" + userName + "вы ввели Х = "+ x+";");
        //_________________________________________________
        System.out.println("Введите redZoneLeft, redZoneRight, redZone2Left, redZone2Right;");
        int redZoneLeft = scanner.nextInt();
        int redZoneRight = scanner.nextInt();
        int redZone2Left = scanner.nextInt();
        int redZone2Right = scanner.nextInt();

        boolean isleft =  x < redZoneLeft;
        boolean isCentre = x >redZoneRight && x<redZone2Left;
        boolean isRight = x >redZone2Right ;

        boolean isgreen = isleft || isCentre|| isRight;
        System.out.println("X входит в зелений дипазон? - "+ isgreen +";");
        System.out.println("Спасибо," + userName + ", что пользовались нашей программой!!!");
       // System.out.println("Значит всё хорошо!");


       /* boolean isfirst = x>1000 && x<2000;
        boolean issecond = x>4000 && x<5000;
        boolean isred = isfirst || issecond;
        System.out.println(" X входит в красний диапазон?-" + isred + ";");
        System.out.println("Не очень хорошо!");*/


        //_________________________________________________
    }
}

