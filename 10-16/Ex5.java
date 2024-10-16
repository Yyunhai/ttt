import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        switch (num){
            case 1:System.out.println("A");break;
            case 2:System.out.println("B");break;
            case 3:System.out.println("C");break;
            case 4:System.out.println("D");break;
            default:System.out.println("ERROR");break;

        }

    }
}
