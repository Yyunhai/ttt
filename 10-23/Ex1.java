import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        boolean flag = true;
        for (int i = 2;i<n;i++){
            if (n%i==0){
                flag = false;
                break;
            }
        }
        if (flag == true){
            System.out.println("Ture");

        }else{
            System.out.println("False");
        }
    }
}
