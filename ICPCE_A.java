import java.util.*;
public class ICPCE_A {//ok
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ac =sc.nextInt();
        for(int i=0;i<ac;i++){
            int u=0;
            int k = sc.nextInt();
            for(int o=k;o>=1;o--){
                if(k%o==0){
                    u+=o;
                }
            }
            System.out.println(u);
        }
    }
}
