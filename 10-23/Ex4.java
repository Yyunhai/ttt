import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s,n,x,max = 0,min=1000;
        n = in.nextInt();
        s = 0;
        for (int i = 1;i<=n;i++){
            x = in.nextInt();
            s = s+x;
            if (n == 1){
                max = x;
                min = x;
            }
            else{
                if (x>max){
                    max = x;
                }
                if (min>x){
                    min = x;
                }
            }

        }
        System.out.printf("平均分%f\n",1.0*s/n);
        System.out.printf("最高分%d\n最低分%d",max,min);
    }
}