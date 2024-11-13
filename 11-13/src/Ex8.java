import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] x = new int[10];
        int i;
        for (i = 0;;i++){
            x[i] = n%10;
            n = n/10;
            if (n == 0)break;
        }
        for (int j = i;j>=0;j--){
            System.out.println(x[j]);
        }

    }
}
