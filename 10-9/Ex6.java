import java.util.Scanner;
public class Ex6 {
    public static void main (String[] args){
        int n,num;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n<=72){
            num = 0;
        }else if (n<=90){
            num = 3;
        }else{
            num = 6;
        }
        System.out.printf("%d",num);
    }
}
