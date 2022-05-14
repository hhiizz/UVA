import java.util.*;

public class UVA00948 {
    public static void main(String[] args) {//ok
        Scanner sc = new Scanner(System.in);
        long frb [] = new long [100];
        frb [0] =1;
        frb [1] =2;
        long max = 0;
        int num = 2;
        while(max< 100000000){
            frb[num]=frb[num-1]+frb[num-2];
            max = frb[num++];
        }
        int a =sc.nextInt();
        while(a-->0){
            boolean yes = true;
            int b = sc.nextInt();
            System.out.print(b+" = ");
            for(int i=frb.length-1;i>=0;i--){
                if(frb[i]<=b&&frb[i]!=0){
                    yes = false;
                    b-=frb[i];
                    System.out.print("1");
                }else if(frb[i]>=b&&!yes){
                    System.out.print("0");
                }else if(b==0){
                    System.out.print("0");
                }
            }
            System.out.println(" (fib)");
        }
    }
}
/*
        Scanner sc = new Scanner(System.in);
        long [] k = new long [39];
        k[0]=1;
        k[1]=2;
        int nu=1;
        long max=0;
        while(max<100000000){
            k[nu+1]+=k[nu]+k[nu-1];
            max=k[nu+1];
            nu++;
        }
        int a =sc.nextInt();
        for(int i=0;i<a;i++){
            int [] ans = new int [39];
            long z = sc.nextLong();
            nu=k.length-1;
            boolean op =false;
            long o=z;
            //if(z==0)break;
            while(z!=0){
                while(true){
                    if(k[nu]<=z){
                        op = true;
                        ans[nu]=1;
                        z=z-k[nu];
                        nu=nu-2;
                        break;
                    }else{
                        nu--;
                    }
                    if(op){
                        ans[nu]=0;
                    }
                }
            }
        int p=ans.length-1;
        while(true){
            if(ans[p]==1){
                break;
            }
            p--;
        }
        String l="";
        for(int s=p;s>=0;s--){
            l+=ans[s];
        }
        System.out.println(o+" = "+l+" (fib)");
    }
*/
