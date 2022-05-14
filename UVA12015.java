import java.util.*;

public class UVA12015 {//ok
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        for(int i=0;i<a;i++){
            String coumt [] = new String[10];
            int count [] = new int [10];
            for(int k=0;k<10;k++){
                coumt[k]=sc.next();
                count[k]=sc.nextInt();
            }
            int max=0;
            for(int k=0;k<10;k++){
                if(max<count[k])max=count[k];
            }
            System.out.println("Case #"+(i+1)+":");
            for(int o=0;o<10;o++){
                if(count[o]==max){
                    System.out.println(coumt[o]);
                }
            }
        }
    }
}
