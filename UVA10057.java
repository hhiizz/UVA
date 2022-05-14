import java.util.*;
public class UVA10057 {//ok
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a =sc.nextInt();
            int [] case0 = new int [a];
            for(int i=0;i<case0.length;i++){
                case0[i]=sc.nextInt();
            }
            Arrays.sort(case0);
            int mid =0;
            int mid2=0;
            mid=case0[(a-1)/2];
            mid2=case0[a/2];
            int count =0;
            for(int i=0;i<case0.length;i++){
                if(case0[i]==mid||case0[i]==mid2)count++;
            }
            int dir = Math.abs(mid-mid2)+1;
            System.out.println(mid+" "+count+" "+dir);
        }
    }
}
/*
1 2 6 8 9 12
6 8
7 6+5+1+1+2+5=20
6 5+4+0+2+3+6=120
8 7+6+2+0+1+4=20
*/