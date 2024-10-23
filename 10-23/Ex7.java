public class Ex7 {
    public static void main(String[] args){
        int i,count;
        count = 0;
        for (i = 2;i<=100;i++){
            int j;
            for (j=2;j<i;j++){
                if (i%j==0){
                    break;
                }
            }
            if (j == i){
                System.out.print(i+" ");
                count++;
                if (count%5==0){
                    System.out.println();
                }
            }
        }
    }
}
