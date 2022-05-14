import java.util.*;
public class UVA00580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int l=0;;
        int counttot =1;
        while(a>3){
            int count = 1;
            int p =a/3;
            l++;
            a--;
            int pp =a%3;
            int z =l+pp+p;
            for(int k=z;k>1;k--){
                count*=k;
            }
            int lli=1;
            if(p>1)lli*=n(p-1);
            if(l>1)lli*=n(l-1);
            if(pp>1)lli*=n(l-1);
            count/=lli;
            counttot+=count;
        }
        System.out.println(counttot);
    }
    private static int n(int o){
        int count =1;
        for(int k=o;k>0;k--){
            count*=k;
        }
        return count;
    }
}
