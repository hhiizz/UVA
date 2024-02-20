import java.util.*;
public class UVA10783 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int count =1;
        while(a-->0){
            int z =sc.nextInt();
            int b = sc.nextInt();
            int total = 0;
            for(int i=z;i<=b;i++){
                if(i%2!=0)
                    total+=i;
            }
            System.out.println("Case "+(count++)+": "+total);
        }
    }
}
/*int  a = sc.nextInt();//ok
int o=1;
for(int i=0;i<a;i++){
    int b = sc.nextInt();
    int c = sc.nextInt();
    int ans = 0;
    for(int z = b;z<=c;z++){
        if(z%2!=0){
            ans+=z;
        }
    }
    System.out.println("Case "+(o++)+": "+ans);
}
*/