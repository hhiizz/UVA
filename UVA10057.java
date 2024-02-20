import java.util.*;

public class UVA10057 {//ok
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
        int count =0;
        int max = 1;
        int a = sc.nextInt();
        int b [] = new int [a];
        for(int i=0;i<a;i++){
            b[i]= sc.nextInt();
        }
        Arrays.sort(b);
        int mid =b[(b.length-1)/2];
        int mid2 = b[b.length/2];
        for(int i=0;i<a;i++){
            if(b[i]==mid||b[i]==mid2)count++;
        }
        if(b.length%2==0){
            max = mid2-mid+1;
        }
        System.out.println(mid+" "+count+" "+max);
    }
    }
}
