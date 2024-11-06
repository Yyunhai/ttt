import java.util.Scanner;
public class dfghjkl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n,i,num;
        m = in.nextInt();
        n = in.nextInt();
        for (i = m;i>1;i--){
            if (m%i==0 && n%i==0){
                System.out.println(i);
                break;
            }
        }
        num = (m*n)/i;
        System.out.printf("最大公约数%d\n最小公倍数%d",i,num);

    }
}