import java.lang.reflect.Array;
import java.util.*;
public class UVA11827 {
    public static void main(String[] args) {//ok
        Scanner sc = new Scanner(System.in);
        int a =Integer.parseInt(sc.nextLine());
        while(a>0){
            String str = sc.nextLine();
            String ass [] = str.split(" ");
            List <Integer> a1 = new ArrayList<>();
            List <Integer> cbd = new ArrayList<>();
            HashSet <Integer> cbd2 = new HashSet<>();
            for(int i =0;i<ass.length;i++){
                a1.add(Integer.parseInt(ass[i]));
            }
            for(int i =0;i<a1.size();i++){
                int ok=a1.get(i);
                for(int z =1;z<=ok;z++){
                    if(ok%z==0){
                        cbd.add(z);
                    }
                }
            }
            for(int i =0;i<cbd.size();i++){
                int ok=cbd.get(i);
                for(int z =0;z<cbd.size();z++){
                    if(ok==cbd.get(z)&&i!=z)cbd2.add(ok);
                }
            }
            int max=0;
            for(Integer l:cbd2){
                if(l>max)max=l;
            }
            System.out.println(max);
            a--;
        }
    }
}
