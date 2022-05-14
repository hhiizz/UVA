import java.util.*;
class UVA10931{//OK
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
/*
        Scanner sc = new Scanner(System.in);
        String count ="";
        String com ="";
        int zz=0;
        while(sc.hasNext()){
            int a =sc.nextInt();
            if(a==0)break;
            //if(a==1)com="1";
            while(true){
                if(a<=1)break;
                count+=Integer.toString(a%2);
                a=a/2;
            }
            count+="1";
            for(int i=count.length()-1;i>=0;i--){
                if(count.charAt(i)=='1')zz++;
                com += count.charAt(i);
            }
            System.out.println("The parity of "+com+ " is "+zz+" (mod 2).");
            com="";
            count="";
            zz=0;
        }
*/