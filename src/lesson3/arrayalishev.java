package lesson3;

public class arrayalishev {
    public static void main(String[] args) {
        int number = 10;// примитивный тип данных  [x]
        int [] numbers = new int [10];  // numbers => [массив]
        //System.out.println(numbers[0]); // 0;1;2;3;4
        for (int i=0; i< numbers.length; i++){
            numbers [i] = i*2;
        }
        for(int i = 0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }


    }
}
