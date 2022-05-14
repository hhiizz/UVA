import java.util.*;
class UVA11332{//OK
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            String k =sc.next();
            if(k.equals("0"))break;
            long a=0;
            while(k.length()>1){
                for(int i=0;i<k.length();i++){
                    a+=(k.charAt(i)-'0');
                }
                k=a+"";
                a=0;
            }
            System.out.println(k);
        }

    }
}