import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
       double n,n1;
       int num;
       Scanner in = new Scanner(System.in);
       n = in.nextDouble();
       n1 = in.nextDouble();
       if (n>600 || n1>145){
           num = 1;
       }else{
           num = 0;
       }
       System.out.printf("%d",num);
    }
}
