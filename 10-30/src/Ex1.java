public class Ex1 {
    public static void main(String[] args) {
        int i,s;
        for (i=1;i<=9;i++){
            int j;
            for (j=1;j<=i;j++){
                s = i*j;
                System.out.printf("%dX%d=%d  ",j,i,s);
            }
            System.out.println();
        }
    }
}
