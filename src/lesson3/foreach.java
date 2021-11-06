package lesson3;

public class foreach {
    public static void main(String[] args) {
        String[] array = {"abc", "aaaa", "oooo", "wwww"};
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
            for (String value :array) {
                System.out.println(value);
            }

        }
    }
