import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        int i,num,sum;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        sum = 1;i = 1;
        while (i<=num){
            sum = sum*i;
            i+=1;
        }
        System.out.println(sum);
    }
}
