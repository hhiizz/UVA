import java.util.*;
class UVA10931{//yes
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        while(sc.hasNextInt()){
            int a =sc.nextInt();
            if(a==0)break;
            int count = 0;
            String u = Integer.toBinaryString(a);
            for(int i=0;i<u.length();i++){
                if(u.charAt(i)=='1')count++;
            }
            System.out.println("The parity of "+u +" is "+count+" (mod 2).");
        }
    }
}
