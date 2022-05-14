import java.util.*;
public class UVA10922 {//ok
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.next();
            if(a.equals("0"))break;
            String u =a;
            int count = 0;
            int s =0;
            if(a.length()==1){
                s = Integer.parseInt(a);
                count++;
            }else{
                while(a.length()!=1){
                    s=0;
                    for(int i=0;i<a.length();i++){
                    s += (a.charAt(i)-'0');
                    }
                    a=s+"";
                    count++;
                }
            }
            if(s==9){
                System.out.println(u+" is a multiple of 9 and has 9-degree "+count+".");
            }else{
                System.out.println(u+" is not a multiple of 9.");
            }
        }
    }
}

/*
        while(sc.hasNext()){
            String a =sc.next();
            String p=a;
            if(a.equals("0"))break;
            long num=0;
            int ans =0;
            while(a.length()>1){
                for(int i=0;i<a.length();i++){
                    num+=(int)(a.charAt(i)-'0');
                }
                a=num+"";
                ans++;
                num=0;
            }
            if(ans==0)ans++;
            if(Integer.parseInt(a)%9==0){
                System.out.println(p+" is a multiple of 9 and has 9-degree "+ans+".");
            }else{
                System.out.println(p+" is not a multiple of 9.");
            }
        }
*/
