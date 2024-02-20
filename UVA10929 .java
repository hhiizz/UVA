import java.util.*;
class CPE10929{//OK
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int dub = 0;
            int ant = 0;
            String aa = sc.next();
            if(aa.equals("0"))break;
            for(int i=0;i<aa.length();i++){
                if(i%2==0){
                    dub+=(aa.charAt(i)-'0');
                }else{
                    ant+=(aa.charAt(i)-'0');
                }
            }
            if((dub-ant)%11 == 0){
                System.out.println(aa+" is a multiple of 11.");
            }else{
                System.out.println(aa+" is not a multiple of 11.");
            }
        }
    }
}
/*
        Scanner sc= new Scanner (System.in);
        while(sc.hasNext()){
            int z1=0;
            int z2=0;
            String a = sc.next();
            if(a.equals("0"))break;
            for(int i=0;i<a.length();i++){
                if(i%2==0){
                    z2+=(a.charAt(i)-'0');
                }else{
                    z1+=(a.charAt(i)-'0');
                }
            }
            if((z1-z2)%11==0){
                System.out.println(a+" is a multiple of 11.");
            }else{
                System.out.println(a+" is not a multiple of 11.");
            }
        }
 */
