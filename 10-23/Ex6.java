import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,n;
        a = 1;
        n = in.nextInt();
        for (int i = n-1;i>=1;i--){
            a = 2*(a+1);
        }
        System.out.println(a);
    }
}