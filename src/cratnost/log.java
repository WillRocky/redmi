package cratnost;

public class log {
    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;

        boolean result = t && f;

        System.out.println(" t = t = " + (t && t));
        System.out.println(" f = t = " + (f && t));
        System.out.println(" t = f = " + (t && f));
        System.out.println(" f = f = " + (f && f));
        System.out.println();

        System.out.println(" t || t = " + (t || t));
        System.out.println(" f || t = " + (f || t));
        System.out.println(" t || f = " + (t || f));
        System.out.println(" f || f = " + (f || f));


        int x= 1200;
        result= x >=1000 && x <= 2000;
        System.out.println("x [1000:2000] = " + result);
        System.out.println("x ![1000:2000] = " + !result);

        result = x < 1000 || x> 2000;
        System.out.println("x [1000:2000] = " + result);

        boolean isleft = x < 1000;
        boolean isCentre = x >2000 && x<4000;
        boolean isRight = x >5000 ;

        boolean isgreen = isleft || isCentre|| isRight;
        boolean isgreen2 = x<1000 || x>2000 && x<4000 || x> 5000;
        System.out.println("x ="+ x + "; isgreen = " + isgreen);
        System.out.println("x ="+ x + "; isgreen2 = " + isgreen);

    }
}
