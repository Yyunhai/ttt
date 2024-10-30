import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,num = 0;
        n = in.nextInt();
        for (int x=1;x<=n/5;x++){
            for (int y=1;y<=n/2;y++) {
                int z = n-5*x-2*y;
                if (z>=1) {
                    num+=1;
                    System.out.printf("%d %d %d\n",x,y,z);

                }
            }
        }
        System.out.printf("有%d种换法",num);
    }
}
