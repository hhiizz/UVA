import java.util.*;
public class UVA00494 {
    public static void main(String[] args) {//ok
        Scanner sc = new Scanner(System.in);
        String a;
        while(sc.hasNext()){
            a=sc.nextLine();
            char o [] =a.toCharArray();
            int count=0;
            for(int i=1;i<o.length;i++){
                if(!(('A'<=o[i]&&o[i]<='Z')||('a'<=o[i]&&o[i]<='z'))){
                    if(('A'<=o[i-1]&&o[i-1]<='Z')||('a'<=o[i-1]&&o[i-1]<='z')){
                        count++;
                    }
                }
            }if(('A'<=o[o.length-1]&&'Z'<=o[o.length-1])||('a'<=o[o.length-1]&&'z'<=o[o.length-1]))count++;
            System.out.println(count);
        }
    }
}
