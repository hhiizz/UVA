import java.util.*;
class UVA10812{//ok
    public static void main(String[] args) {//ok
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(count-->0){
            int a =sc.nextInt();
            int b =sc.nextInt();
            if(a<b){
                System.out.println("impossible");
                continue;
            }
            int a1 =(a+b)/2;
            int b1 =(a-b)/2;
            if(a1+b1==a&&Math.abs(a1-b1)==b){
                System.out.println(a1+" "+b1);
            }else{
                System.out.println("impossible");
            }
        }
    }
}
/*
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        for(int i=0;i<a;i++){
            int b =sc.nextInt();
            int c =sc.nextInt();
            float x1,x2;
            if(b%2!=0){
                x1=(b+1)/2;
                x2=(b-1)/2;
            }else{
                x1=b/2;
                x2=b/2;
            }
            while(true){
                if(x1+x2==b&&Math.abs(x1-x2)==c){
                    System.out.println((int)x1+" "+(int)x2);
                    break;
                }else if(x1==0||x2==0){
                    System.out.println("impossible");
                    break;
                }else{
                    x1++;
                    x2--;
                }
            }
        }
*/