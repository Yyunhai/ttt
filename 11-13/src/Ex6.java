import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] x = new int[n];
        for (int i=0;i<=n-1;i++){
            x[i]=in.nextInt();
        }
        int s = 0;
        for (int i = 0;i<=n-1;i++){
            s = s+x[i];
        }
        System.out.println(s);
        System.out.println(1.0*s/n);
        int max = x[0];
        for (int i = 0;i<=n-1;i++){
            if (x[i]>max) max=x[i];
        }
        System.out.println(max);
    }
}