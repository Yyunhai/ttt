import java.util.Scanner;
public class Ex8 {
    static int z1,z2;

    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();y = in.nextInt();
        f(x,y);
        h(x,y);
        System.out.println(z1);
        System.out.println(z2);
    }
    public static void f(int a,int b){
        for (int i=a;i>=1;i++){
            if (a%i==0 && b%i==0){
                z1 = i;
                break;
            }
        }
    }
    public static void h(int a,int b){
        for (int i=a;i<=a*b;i++){
            if (i%a==0 && i%b==0){
                z2 = i;
                break;
            }
        }
    }
}
