package homework3;

public class array5 {
    public static void main(String[] args) {
        int [] array = {1,4,5,3,4,5,5,6,8,0,1,7};
        int five = 5;
        int wer =0;
        for (int i=0; i<array.length; i++ ) {
         if (five== array[i ]) {
             wer ++;
         }
         }
        System.out.println("Our number :" + five);
        System.out.println("Number of times it appears " + wer);




        }

    }

