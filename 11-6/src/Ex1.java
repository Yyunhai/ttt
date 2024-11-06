import java.util.Scanner;
public class Ex1 {
    public static int add(int a,int b){
        int c;
        c = a+b;
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,s;
        a = in.nextInt();b = in.nextInt();
        s = add(a,b);
        System.out.println(s);
    }
}
