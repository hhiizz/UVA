import java.util.*;
public class UVA10091 {
    public static void main(String []args){//ok
    Scanner sc = new Scanner (System.in);
    int a =sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            String bstr=Integer.toString(b);
            String c ="";
            while(b!=0&&b!=1){
                c+=b%2;
                b=b/2;
            }
            if(b==1){
                c+=1;
            }
            String b2="";
            for(int u =0;u<bstr.length();u++){
                int b2int =bstr.charAt(u)-'0';
                while(b2int!=0&&b2int!=1){
                    b2+=b2int%2;
                    b2int=b2int/2;
                }
                if(b2int==1){
                    b2+=1;
                }
            }
            int ansb1=0;
            int ansb2=0;
            for(int p=0;p<c.length();p++){
                if(c.charAt(p)=='1')ansb1++;
            }
            for(int p=0;p<b2.length();p++){
                if(b2.charAt(p)=='1')ansb2++;
            }
            System.out.println(ansb1+" "+ansb2);
        }
    }
}
