import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        int i,num,sum,a,item;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        num = 9;
        sum = 0;
        i = 1;
        item = a;
        while (i<=num){
            sum = sum+item;
            i=i+1;
            item = item*10+a;
        }

        System.out.println(sum);
    }
}