import java.util.Random;
public class Ex4 {
    public static void main(String[] args){
        int num,num2 ,sum;
        Random r =new Random();
        num = r.nextInt(1,100+1);
        num2 = r.nextInt(1,100+1);
        sum = num+num2;
        System.out.printf("%d %d %d",num,num2,sum);
    }
}
