import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        double x, y, x1,y1,m;
        Scanner in = new Scanner(System.in);

        x = in.nextDouble();
        y = in.nextDouble();
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        m = Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
        System.out.printf("%.2f",m);
    }
}
