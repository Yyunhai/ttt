import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n, z;
        m = in.nextInt();
        n = in.nextInt();
        z = g(m, n);
        System.out.println(z);
    }
    public static int g(int m,int n){
        int a,b,c;
        a = f(m);b = f(n);c = f(m-n);
        return a/(b*c);
    }
    public static int f(int n){
        int s,i;
        s = 1;
        for (i = 1;i<=n;i++){
            s = s*i;
        }
        return s;
    }
}
