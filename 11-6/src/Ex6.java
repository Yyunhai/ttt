import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        g(2,100);
    }
    public static void g(int a,int b){
        int i;
        for (i=a;i<=b;i++){
            if(f(i))System.out.println((i));
        }
    }
    public static boolean f(int n){
        int i;
        for (i = 2;i<=n-1;i++){
            if (n%i==0)break;
        }
        return i == n;
    }
}
