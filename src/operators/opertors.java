package operators;

public class opertors {
    public static void main(String[] args) {
        int a = 2;
        int i = 5;
        int value=i-10;

        int x =a+i;
        x= a-i;
        x-=i;
        x+=i;
        x/=i;
        x*=i;
        int c = i/a;

        float ur = (float)(double)i/a;


        x= (10+10)*2;

        x=0;
        x=x+1;
        x+=1;
        x++;     //постфиксный
        ++x;     //префиксный




        x=0;
        value = x++;
        System.out.println("x="+ x);
        x=0;
        int value2 = ++x;
        System.out.println("x="+ x);






    }
}
