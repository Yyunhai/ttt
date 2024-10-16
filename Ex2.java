import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        double x,x1,x2,y,y1,y2,y3,a,b,c,p,s;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2= in.nextDouble();
        y2 = in.nextDouble();
        a = Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
        b = Math.sqrt(Math.pow(x-x2,2)+Math.pow(y-y2,2));
        c = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        if (a+b>c && a+c>b && c+b>a){
            p = (a+b+c)/2;
            s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("周长%f 面积%f",(a+b+c),s);
        }else{
            System.out.print("Impossible");
        }
    }
}
