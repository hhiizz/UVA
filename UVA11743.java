import java.util.*;
public class UVA11743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        while(a>0){
            int toto1=0;
            int toto2=0;
            String as = sc.nextLine();
            String ass []  = as.split(" ");
            int o =0;
            for(int i=0;i<ass.length;i+=2){
                o =as.charAt(i)-'0';
                    int op = o*2;
                    toto1+= op%10+op/10;
            }
            for(int i=1;i<as.length();i+=2){
                toto2+=as.charAt(i)-'0';
            }

            toto1+=toto2;
            if(toto1%10==0){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
            a--;
        }
    }
}