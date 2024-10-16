import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a,b;
        char ch;
        a = in.nextInt();
        ch = in.next().charAt(0);
        b = in.nextInt();
        switch (ch){
            case '+':System.out.println(a+b);break;
            case '-':System.out.println(a-b);break;
            case '*':System.out.println(a*b);break;
            case '/':System.out.println(a/b);break;
            default:System.out.println("ERROR");break;

        }

    }
}
