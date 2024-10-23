public class Ex8 {
    public static void main(String[] args){
        int i,a,b,c;
        for (i = 100;i<=999;i++){
            a = i/100;
            b = i/10%10;
            c = i%10;
            if (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3) == i){
                System.out.println(i);
            }
        }
    }
}