import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class UVA10252 {//ok
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            String n ="";
            String a=sc.nextLine();
            char a1 [] = a.toCharArray();
            //if(a.equals("0"))break;
            String b=sc.nextLine();
            char b1 [] = b.toCharArray();
            //if(b.equals("0"))break;
            for(int i=0;i<a1.length;i++){
                for(int k =0;k<b1.length;k++){
                    if(a1[i]==b1[k]){
                    n+=a1[i];
                    b1[k]='#';
                    break;
                    }
                }
            }
            char o [] = n.toCharArray();
            Arrays.sort(o);
            for(char i:o)
                System.out.print(i);
            System.out.println();
        }
    }
}

