import java.util.*;
public class UVA10056 {
    public static void main(String [] args){//yes
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(count-->0){
            int N = sc.nextInt();
            double p = sc.nextDouble();
            int I = sc.nextInt();
            if(p==0){
                System.out.printf("%.4f",p);
            }else{
                System.out.printf("%.4f",p*Math.pow(1-p,I-1)/(1-Math.pow(1-p,N)));
            }
            System.out.println();
        }
    }
}
