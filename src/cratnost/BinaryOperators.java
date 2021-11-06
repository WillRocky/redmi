package cratnost;

public class BinaryOperators {
    public static void main(String[] args) {
        int x = 2; // 000000000000000000010
        int y = 20;
        int a = x | y;
        System.out.println("a = "+ a );

        System.out.println("200 | 1234 ="+ (200 | 1234));
        System.out.println();
        System.out.println("13 & 7 = " + (13 & 7));
        System.out.println("200 & 1234 ="+ (200 & 1234));
        System.out.println("4<< 3 = "+ (4<<3));
    }
}
