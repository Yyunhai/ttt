public class Ex2 {
    public static void main(String[] args) {
        for (int a=0;a<=20;a++){
            for (int b=0;b<=33;b++) {
                int c = 100 - a - b;
                if (5 * a + 3 * b + c / 3.0 == 100) {
                    System.out.printf("%d %d %d\n", a, b, c);
                }
            }
        }
    }
}
