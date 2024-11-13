import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        int n,s;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        s = f(n);
        System.out.println(s);
    }
    public static int f(int n){
        if (n<=2){
            return 1;
        }
        else{
            return f(n-1)+f(n-2);
        }
    }
}