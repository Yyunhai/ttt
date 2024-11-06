import java.util.Scanner;
public class Ex4 {
    public static double distanc(double a,double b,double c,double d){
        double s;
        s = Math.sqrt(Math.pow(a-c,2)+Math.pow(b-d,2));
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1,x2,y1,y2,s;
        x1 = in.nextInt();y1 = in.nextInt();
        x2 = in.nextInt();y2 = in.nextInt();
        s = distanc(x1,y1,x2,y2);
        System.out.println(s);
    }
}
