package lesson3;

public class arrayexample {
    public static void main(String[] args) {
        int x = 0;
        int[] array2 = new int[4];
        int[] array = {0, 1, 2, 10, 101,10003};
        array[1] = 100;

        // 1- выполняется только 1 раз
        // 2 - выполняется каждый раз и проверяет надо ли продолжать проверять итерацию
        // 3 - віполняется по оккончанию каждой итерации
        for (int i = 0; i< array.length; i++) { //начало итерации
            System.out.println(array[i]);

        } // конец итерации



    }
}

