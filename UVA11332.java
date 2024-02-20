import java.util.*;
class UVA11332{//OK
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            String a = sc.next();
            if(a.equals("0"))break;
            while(a.length()>1){
                int total =0;
                for(int i=0;i<a.length();i++){
                    total+=a.charAt(i)-'0';
                }
                a = total+"";
            }
            System.out.println(a);

        }
    }
}