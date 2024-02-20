import java.util.*;
public interface ICPE_I {//ok
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        for(int i=0;i<a;i++){
            int count = sc.nextInt();
            int number [][] = new int [count+1][count+1];
            int umber = 0;
            for(int l=0;l<=count;l++){
                for(int k=0;k<=umber;k++){
                    number[l][k]=k+1;
                    if(k+1>umber)number[l][k]=1;
                    if(l>=3&&(k>=1&&k<=umber-1)){
                        number[l][k]=number[l-1][k]+number[l-1][k-1];
                    }
                }
                umber++;
            }
            for(int [] e:number){
                for(int s :e){
                    if(s!=0){
                        System.out.print(s+" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
