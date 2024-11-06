import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args){
        double x, y;
        Scanner in = new Scanner(System.in);

        x = in.nextDouble();
        y = in.nextDouble();
        if (x>0 && y>0){
            System.out.print("第一象限");
        }
        else if (x>0 && y<0){
            System.out.print("第四象限");
        }
        else if (x<0 && y<0){
            System.out.print("第三象限");
        }
        else{
            System.out.print("第二象限");
        }

    }
}
