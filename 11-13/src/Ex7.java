import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int [] x = new int[n];
        x[0] = 1;x[1] = 1;
        for (int i = 2;i<=n-1;i++){
            x[i] = x[i-1]+x[i-2];
        }
        for (int i = 0;i<=n-1;i++){
            System.out.println(x[i]);
        }

    }
}
