import java.util.*;
class UVA10101{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int count = 1;
        while(sc.hasNextLong()){
        Long a = sc.nextLong();
        System.out.printf("%4d.", count);
        if(a==0){
            System.out.print(" 0");
        }else{
            chage(a);
        }
        count++;
        System.out.println();
    }
    }
    public static void chage(Long a){
        if(a>=10000000){
            chage(a/10000000);
            System.out.print(" kuti");
            a = a%100000000;
        }
        if(a>=100000){
            chage(a/100000);
            System.out.print(" lakh");
            a = a%100000;
        }
        if(a>=1000){
            chage(a/1000);
            System.out.print(" hajar");
            a = a%1000;
        }
        if(a>=100){
            chage(a/100);
            System.out.print(" shata");
            a = a%100;
        }
        if(a>0){
            System.out.print(" "+a);
        }
    }
}

