import java.util.*;
public class UVA10170 {
    public static void main(String[] args) {//yes
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int count=1;
            if(b<a)
                System.out.println(a);
            else
            for(long i = a;i<=b;i++){
                if((a+i)*count/2>=b){
                    System.out.println(i);
                    break;
                }
                count++;
            }
        }
    }
}
