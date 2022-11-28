package Seetha;

public class SeethaLCM {
    public static void main(String[] args) {

        int sum1=0;
        int sum2=0;
//        int total =sum1+sum2;
        int n,m ;
        for(n=200;n<=300;n++){
            if(n%4==0 && n%6==0 && n%8==0){
                sum1=sum1+n;
            }
        }

        for(m=400;m<=800;m++){
            if(m%25==0 && m%45==0) {
                sum2=sum2+m;

            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        int total=sum1+sum2;
        System.out.println(total);
    }
}
