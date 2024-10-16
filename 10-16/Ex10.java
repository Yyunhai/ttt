import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        int i,num;
        double sum;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        sum = 0;i = 1;
        while (i<=num){
            if (i%2 == 1){
                sum = sum+1.0/i;
            }
            else {
                sum = sum - 1.0 / i;
            }
            i+=1;
        }
        System.out.println(sum);
    }
}
