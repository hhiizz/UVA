import java.util.*;

public class UVA11321 {//ok
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int s=0;s<20;s++){
        int a =sc.nextInt();
        int b =sc.nextInt();
        if(a==0&&b==0){
            System.out.println(a+" "+b);
            break;
        }
        int count [][] = new int [b][a];
        int count1 [][] = new int [b][a];
        for(int i=0;i<a;i++){
            int x =sc.nextInt();
            if(x%2==0){
                count[x%b][i]=x;
            }else{
                count1[x%b][i]=x;
            }
        }
        for(int i=0;i<count.length;i++){
            Arrays.sort(count[i]);
            Arrays.sort(count1[i]);
        }
        int i=0;
        System.out.println(a+" "+b);
        while(i<b){
            for(int u=count1[i].length-1;u>0;u--){
                if(count1[i][u]!=0)
                System.out.println(count1[i][u]);
            }
            for(int u=0;u<count[i].length;u++){
                if(count[i][u]!=0)
                System.out.println(count[i][u]);
            }
            i++;
        }
    }
    }
}
