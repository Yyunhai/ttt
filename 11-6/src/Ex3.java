import java.util.Scanner;
public class Ex3 {
    public static boolean fort(int a,int b,int c){
        boolean d;
        if (a+b>c && a+c>b && b+c>a){
            d = true;
        }
        else{
            d = false;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        boolean d;
        a = in.nextInt();b = in.nextInt();c = in.nextInt();
        d = fort(a,b,c);
        System.out.println(d);
    }
}
