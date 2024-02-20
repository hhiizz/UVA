package uva_10_15;
import java.util.*;
public class UVA10252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            char [] z1 = sc.nextLine().toCharArray();
            char [] z2 = sc.nextLine().toCharArray();
            char [] ans = new char [z1.length];
            for(int i=0;i<z1.length;i++){
                for(int k=0;k<z2.length;k++){
                    if(z1[i] == z2[k]){
                        ans[i] = z1[i];
                        z2[k] = '-';
                        break;
                    }
                }
            }
            Arrays.sort(ans);
            for(char u:ans){
                if(u != '\0'){
                    System.out.print(u);
                }
            }
            System.out.println();
        }
    }
}
