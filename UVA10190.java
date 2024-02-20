import java.util.*;
public class UVA10190 {
    public static void main(String[] args) {//yes
        Scanner sc = new Scanner (System.in);
        while(sc.hasNextInt()){
            boolean yes = false;
            Long a = sc.nextLong();
            Long b = sc.nextLong();
            Long c = b;
            while(c<=a){
                if(a==0||b==0||b==1){
                    break;
                }
                if(c == a){
                    yes = true;
                    break;
                }
                c = (long)Math.pow(c,2);
                System.out.println(c);
            }
            if(yes){
                System.out.print(a+" ");
                while(a/b!=1){
                    a = a/b;
                    System.out.print(a+" ");
                }
                System.out.println(1);
            }else{
                System.out.println("Boring!");
            }
        }
    }
}
