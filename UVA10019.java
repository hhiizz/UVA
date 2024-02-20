import java.util.*;
public class UVA10019 {//yes
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-->0){
            int tobincount = 0;
            int toheacount = 0;
            int x = sc.nextInt();
            String o = Integer.toBinaryString(x);
            for(int i=0;i<o.length();i++){
                if(o.charAt(i)=='1')tobincount++;
            }
            int i = Integer.parseInt(x+"",16);
            System.out.println(i);
            String xp = Integer.toBinaryString(i);
            for(int k=0;k<xp.length();k++){
                if(xp.charAt(k)=='1')toheacount++;
            }
            System.out.println(tobincount+" "+toheacount);
        }
    }
}
