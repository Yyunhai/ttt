import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x,y;
        x = in.nextInt();
        y = in.nextInt();
        if (x == 123 && y == 123){
            System.out.print(1);
        }
        else if (y == 123){
            System.out.print(2);
        }
        else if (x == 123){
            System.out.print(3);
        }else{
            System.out.print(4);
        }
    }
}
