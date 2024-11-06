import java.util.Scanner;
public class Ex5 {
    public static boolean ss(int a){
        int i;
        for (i = 2;i<=a-1;i++){
            if (a%i==0)break;
        }
        return i == a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;boolean b;
        num = in.nextInt();
        b = ss(num);
        System.out.println(b);
    }
}
