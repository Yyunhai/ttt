import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        int m,n,s;
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        s = f(m,n);
        System.out.println(s);
    }
    public static int f(int m,int n){
        if(m%n==0){
            return n;
        }
        else{
            return f(n,m%n);
        }
    }
}