import java.util.*;

public class UVA00948 {
    public static void main(String [] args){//yes
        Scanner sc = new Scanner(System.in);
        int a [] = new int [100];
        int count =0;
        a[0]=1;
        a[1]=2;
        for(int i=2;a[i-1]<100000000;i++){
            a[i]=a[i-1]+a[i-2];
            count = i;
        }

        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            boolean yes = false;
            int y = sc.nextInt();
            System.out.print(y+" = ");
            for(int z = count;z>=0;z--){
                if(a[z]<=y){
                    y-=a[z];
                    yes = true;
                    System.out.print("1");
                }else if(yes){
                    System.out.print("0");
                }
            }
            System.out.println(" (fib)");

        }
    }
}

