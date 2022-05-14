import java.util.*;
public class UVA11417 {
    public static void main(String [] args){//ok
        Scanner sc = new Scanner (System.in);
        while(sc.hasNextInt()){
            int max =1;
            int G =0;
            int n = sc.nextInt();
            if(n==0)break;
            for(int i=1;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    for(int k=2;k<=i;k++){
                        if(i%k==0&&j%k==0){
                            max = k;
                        }
                    }
                    G+=max;
                    max = 1;
                }
            }
            System.out.println(G);
        }
    }
}
/*
        while(sc.hasNextInt()){
            int N =sc.nextInt();
            if(N==0)break;
            int G=0;
            int max=1;
            for(int i=1;i<N;i++){
                for(int j=i+1;j<=N;j++){
                    for(int k=2;k<=j;k++){
                        if(i%k==0&&j%k==0){
                            max =k;
                        }
                    }
                    G+=max;
                    max=1;
                }
            }
            System.out.println(G);
        }
*/
