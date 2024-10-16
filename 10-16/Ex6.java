import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        switch (num/10){
            case 9,10:System.out.println("A");break;
            case 8:System.out.println("B");break;
            case 7:System.out.println("C");break;
            case 6:System.out.println("D");break;
            default:System.out.println("E");break;

        }

    }
}
