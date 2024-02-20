package cpe_12_15;
import java.util.*;
public class UVA10922 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String z = sc.next();
            System.out.print(z);
            if(z.equals("0"))break;
            int count = 0;
            if(z.length()==1){
                count++;
            }else{
                while (z.length()!= 1) {
                    int ans = 0;
                    for(int i=0;i<z.length();i++){
                        ans+=(z.charAt(i)-'0');
                    }
                    z = Integer.toString(ans);
                    count++;
                }
            }
            if(Integer.parseInt(z)%9==0){
                System.out.println(" is a multiple of 9 and has 9-degree "+count+".");
            }else{
                System.out.println(" is not a multiple of 9.");
            }
        }
    }
}
