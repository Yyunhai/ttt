import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] x = new int[n];
        for (int i=0;i<=n-1;i++){
            x[i]=in.nextInt();
        }
        for (int i=0;i<=n-1;i++){
            System.out.println(x[i]);
        }
    }
}