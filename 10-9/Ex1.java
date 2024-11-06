import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        double a,b,c,d;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = 2*(a+b);
        d = a*b;
        System.out.printf("%f %f",c,d);
    }
}
