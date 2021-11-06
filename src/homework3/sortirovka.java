package homework3;
import java.util.Scanner;
public class sortirovka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i<array.length; i++) {
            array[i] = scanner.nextInt();

        }
        for ( int i =0; i <array.length; i++){
        for (int j =1;j<(length-1); j++){
            if (array[j-1] > array[j]){
                int sort = array [j-1];
                array[j-1]= array[j];
                array[j]= sort;
            }



            }
        }for (int value: array) {
            System.out.print(value + " ");
        }





    }

}
