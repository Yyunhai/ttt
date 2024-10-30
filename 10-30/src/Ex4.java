import java.util.Scanner;
import java.util.Random;
public class Ex4 {
    public static void main(String[] args) {
        int num,n,i;
        Random in = new Random();
        num = in.nextInt(1,11);
        System.out.println(num);
        Scanner sc = new Scanner(System.in);

        for (i= 1;i<=3;i++){
            n = sc.nextInt();
            if (n == num){
                break;
            }
        }
        switch (i) {
            case 1: System.out.println("very lucky");break;
            case 2: System.out.println("good lucky");break;
            case 3: System.out.println("good");break;
            default: System.out.println("lost");break;

        }
    }
}
