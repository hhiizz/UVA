import java.util.*;
class CPE10929{//OK
    public static void main(String[] args) {
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
    }
}
    /*
            while(sc.hasNext()){
            int z1=0;
            int z2 =0;
            String a = sc.next();
            String a2 = sc.next();
            System.out.println(a+" and "+a2+" sitting in the tree");
            if(a.equals("0"))break;
            char m [] = a.toCharArray();
            for(int i=0;i<m.length;i++){
                if(i%2==0){
                    z2+=(m[i]-'0');
                }else{
                    z1+=(m[i]-'0');
                }
            }
            if(Math.abs(z2-z1)%11==0){
                System.out.println(a+" is a multiple of 11.");
            }else{
                System.out.println(a+" is not a multiple of 11.");
            }
        }
    */
