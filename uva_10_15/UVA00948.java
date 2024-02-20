package uva_10_15;
import java.util.*;
public class UVA00948 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] zz = new int [100];
        zz[0]=1;
        zz[1]=1;
        int count = 0;
        for(int i=2;zz[i-1]<100000000;i++){
            zz[i] = zz[i-1]+zz[i-2];
            count = i;
        }

        int count_ans = sc.nextInt();
        for(int i=0;i<count_ans;i++){
            int ans = sc.nextInt();
            boolean yes = false;
            System.out.print(ans+" = ");
            for(int k=count;k>=1;k--){
                if(zz[k]<=ans){
                    ans-=zz[k];
                    System.out.print("1");
                    yes = true;
                }else if(yes){
                    System.out.print("0");
                }
            }
            System.out.println(" (fib)");
        }
    }
}
