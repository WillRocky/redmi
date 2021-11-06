package practic2;

public class practic5 {
    public static void main(String[] args) {
        int a= 11;
        int b= 10;
        int c= 4;
        boolean abc1 = a>b && c<a;
        System.out.println("1:" + abc1);
        boolean abc2 = b>a && b>c;
        System.out.println("2:" + abc2);
        boolean abc3 = c>a && c>b;
        System.out.println("3:" + abc3);
        boolean abc4 = a < c || a<b;
        System.out.println("4:" + abc4);
        boolean abc5 = b < a && b < c;
        System.out.println("5:" + abc5);
        boolean abc6 = c < a || c < b;
        System.out.println("6:" +abc6);
        boolean abc7 = a<b & a>c;
        System.out.println("7:" + abc7);
        boolean abc8 = b<a & b>c;
        System.out.println("8:"+ abc8);
        boolean out8 = c<b & c>a;
        System.out.println("9:" +out8);





    }


}
