import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        int x,a,b,c;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        a = x/100;
        b = x/10%10;
        c =x%10;
        System.out.printf("%d %d %d",a,b,c);
    }
}
