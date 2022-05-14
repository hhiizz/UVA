import java.util.*;
public class UVA00299 {
    public static void main(String[] args) {//ok
        Scanner sc= new Scanner(System.in);
        int case00 = sc.nextInt();
        while(case00>0){
            int case0 = sc.nextInt();
            int number [] = new int [case0];
            for(int i=0;i<case0;i++){
                number[i]=sc.nextInt();
            }
            int s=1;
            int count =0;
            int max=0;
            for(int i=0;i<number.length;i++){
                for(int k=0;k<number.length-1;k++){
                    if(number[k]>number[k+1]){
                        max = number[k];
                        number[k]=number[k+1];
                        number[k+1]=max;
                        count++;
                    }
                }
            }
            System.out.println("Optimal train swapping takes "+count+" swaps.");
            case00--;
        }
    }
}
