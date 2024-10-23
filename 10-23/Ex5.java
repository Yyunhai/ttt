import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f=1,f1,f2,n;
        f1 = 1;f2 = 1;
        n = in.nextInt();
        for (int i = 3;i<=n;i++){
            f = f1+f2;
            f1 = f2;
            f2 = f;
        }
        System.out.println(f);
    }
}