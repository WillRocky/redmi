package lesson3.ifelse;

import groovy.json.JsonOutput;

public class continueexample {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 100, 200, 1000, -5, 0, -10};

        int sum = 0;
//_____________________________________________
        for (int value : array) {
            if (value <= 0)
                continue;
            sum += value;


        }
        System.out.println("Сумма :"+sum);
        //_____________________________________
        // for (int value : array) {
        //   if (value >= 0) {
    }        //    sum += value;

}



