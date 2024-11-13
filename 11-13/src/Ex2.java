import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        int n,s;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        s = f(n);
        System.out.println(s);
    }
    public static int f(int n){
        if (n==1){
            return 1;
        }
        else{
            return 2*(f(n-1)+1);
        }
    }
}