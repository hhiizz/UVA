import java.util.*;
public class UVA10019 {//ok
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-->0){
            int b = sc.nextInt();
            int b1 =0;
            int b2 =0;
            String s = Integer.toBinaryString(b);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1')b1++;
            }
            int uu = Integer.parseInt(b+"",16);
            String s2 = Integer.toBinaryString(uu);
            for(int i=0;i<s2.length();i++){
                if(s2.charAt(i)=='1')b2++;
            }
            System.out.println(b1+" "+b2);
        }
    }
}
