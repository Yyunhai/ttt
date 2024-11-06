import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){
        double num;
        int y;
        Scanner in = new Scanner(System.in);
        num = in.nextDouble();
        if (num<0){
            y = -1;
        }
        else if (num==0){
            y = 0;
        }
        else {
            y = 1;

        }
        System.out.printf("%d",y);
    }
}
