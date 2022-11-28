public class Breakcontinue {
    public static void main(String[] args) {
        for(int b = 0; b<10; b++){
            if(b==4){
                continue;
            }
            System.out.println(b);
        }
        for(int c = 0; c<10; c++){
            if(c==4){
                break;
            }
            System.out.println(c);
        }
        int a = 0;
        while (a<100){
            System.out.println(a);
            a += 10;
            if(a==70) {
                continue;
            }
            }
        int d = 0;
        while (d<100){
            System.out.println(d);
            d += 10;
            if(d==70) {
                break;
            }
        }
    }
}