import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,s;
        s = 0;
        n = in.nextInt();
        while (n!=0){
            s = s + n%10;
            n = n/10;
        }
        System.out.println(s);
    }
}