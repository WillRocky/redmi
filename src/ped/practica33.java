package ped;
import java.util.Scanner;
public class practica33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Считываем размер массива:");
        int bod = scanner.nextInt();
        int A[] = new int[bod];
        System.out.println("Считываем массив :");
        for (int i = 0; i < bod; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Интересующие элементы массива :");
        for (int i = 0; i < bod; i++) {
            System.out.print(" " + A[i]);

        }
        System.out.println();
        System.out.println("От малого до большого: ");
            for (int i = 0; i < bod; i++) {
                for (int j = 1; j < bod - i; j++) {
                    if (A[j - 1] > A[j]) {
                        //swap elements
                        int temp = A[j - 1];
                        A[j - 1] = A[j];
                        A[j] = temp;
                    }
                }
            } for (int value : A){
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("От большого к малому: ");
            int tem;
        for (int j = 0; j < A.length; j++)
            for (int k = 0; k < A.length - 1; k++) {
                if (A[k] < A[k + 1]) {
                    tem = A[k];
                    A[k] = A[k + 1];
                   A[k + 1] = tem;

                }
            }
        for  (int value : A){
            System.out.print(value + " ");

        }
    }
}