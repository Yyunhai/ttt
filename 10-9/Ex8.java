import java.util.Scanner;
public class Ex8 {
    public static void main (String[] args){
        int year;
        boolean n;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            n = true;
        }else{
            n = false;
        }
        System.out.printf("%s",n);
    }
}
