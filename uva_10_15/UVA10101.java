package uva_10_15;
import java.util.*;
public class UVA10101 {
    public static void main(String[] args) {
        int count =1;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()){
            Long zz = sc.nextLong();
            System.out.printf("%4d.",count);
            if(zz == 0){
                System.out.print(" 0");
            }else{
                chage(zz);
            }
            count++;
            System.out.println("");
        }
    }
    public static void chage(Long zz){
        if(zz>=10000000){
            chage(zz/10000000);
            System.out.print(" kuti");
            zz = zz%10000000;
        }if(zz>=100000){
            chage(zz/100000);
            System.out.print(" lakh");
            zz = zz%100000;
        }if(zz>=1000){
            chage(zz/1000);
            System.out.print(" hajar");
            zz = zz%1000;
        }if(zz>=100){
            chage(zz/100);
            System.out.print(" shata");
            zz = zz%100;
        }
        if(zz>0){
            System.out.print(" "+zz);
        }
    }
}
