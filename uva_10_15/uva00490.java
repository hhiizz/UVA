package uva_10_15;
import java.util.Scanner;

public class uva00490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] ans = new char[101][101];
        int limit = 0;
        int max = 0;
        while(sc.hasNextLine()){
            String zz = sc.nextLine();
            if(zz.length()>max)max = zz.length();
            for(int i=0;i<zz.length();i++){
                ans[limit][i] = zz.charAt(i);
            }
            limit++;
        }

        for(int i=0;i<max;i++){
            for(int k =limit-1;k>=0;k--){
                if(ans[k][i] != '\0'){
                    System.out.print(ans[k][i]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
