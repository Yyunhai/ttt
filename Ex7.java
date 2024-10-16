import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        switch (num/10){
            case 2:System.out.println(29);break;
            case 4,6,9,11:System.out.println(30);break;
            default:System.out.println(31);break;

        }

    }
}
