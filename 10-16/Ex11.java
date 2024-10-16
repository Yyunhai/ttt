import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        int i,num,sum,a;
        //Scanner in = new Scanner(System.in);
        num = 9;
        sum = 0;
        i = 1;
        a = 1;
        while (i<=num){
            sum = sum+a;
            i+=1;
            a = a*10+i;
        }

        System.out.println(sum);
    }
}