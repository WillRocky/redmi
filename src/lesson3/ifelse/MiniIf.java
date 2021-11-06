package lesson3.ifelse;
import  java.util.Scanner;
public class MiniIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resultV1 = null;
        String str = scanner.nextLine();

        //----------------------------------------------
        //String resultV0 = str.length() == 5   ? "Джекпот!!!" : "Провал(";
        System.out.println(str.length() == 5 ? "Джекпот!!!" : "Провал(");
        //----------------------------------------------

        //----------------------------------------
        if (str.length() == 5) {
            resultV1 = "ДЖЕКПОТ!!";
        } else {
            resultV1 = "Провал :(";
        }
        System.out.println(resultV1);
        //________________________________________________________
        System.out.println(str.length() == 5 ? "Джекпот!!!" : (str.length() == 3 ? "Провал" : ""));
        //________________________________________________________

        //
        if (str.length() == 5) {
            System.out.println("ДЖЕКПОТ!!!");
        } else if (str.length() == 3) {
            System.out.println("Провал :(");
        }


    }
}