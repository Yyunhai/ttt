//暂定  --纠正,错误！！！
import java.util.Scanner;
public class Ex5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f=1,f1,f2,n,s;
        s = 2;
        f1 = 1;f2 = 1;
        n = in.nextInt();
        if (n<=2){
            System.out.println(s);
        }
        else{
            for (int i = 3;i<=n;i++){
                f = f1+f2;
                f1 = f2;
                f2 = f;
                s = s+f;
            }
            System.out.println(s);
        }


    }
}