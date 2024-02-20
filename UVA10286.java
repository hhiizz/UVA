import java.util.*;
public class UVA10286 {
    public static void main(String [] args){//yes
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            Long a = Long.parseLong(sc.nextLine());
            String [] as = sc.nextLine().split("\\s+");
            long ans = 0;
            long p = 1;
            for(int i=as.length-2;i>=0;i--){
                ans+= Long.parseLong(as[i])*(as.length-1-i)*p;
                p*=a;
            }
            System.out.println(ans);
        }
    }
}



