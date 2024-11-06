import java.util.Scanner;
public class Ex7 {
    public static void main (String[] args){
        double num,sum;
        Scanner in = new Scanner(System.in);
        num = in.nextDouble();
        if (num<=3){
            sum = 10;
        }
        else if (num<=10){
            sum = 10+(num-3)*2;
        }
        else{
            sum = 10 + 14 + (num-10)*1;
        }
        System.out.printf("%f",sum);
    }
}
