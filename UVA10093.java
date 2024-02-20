import java.util.*;
public class UVA10093 {
    public static void main(String [] args){//yes
        Scanner sc = new Scanner (System.in);
        while(sc.hasNextLine()){
            String sd= sc.nextLine();
            char [] b = sd.toCharArray();
            int sum = 0;
            int max = 1;
            for(char i:b){
                int R =0;
                if(i>=48 && i<=57){
                    R = i-48;
                }else if(i>=65 && i<=90 ){
                    R = i-55;
                }else if(i>=97 && i<=122){
                    R = i-61;
                }
                sum+=R;
                if(R>max)max=R;
            }
            for(int i=max;i<=62;i++){
                if(i==62){
                    System.out.println("such number is impossible!");
                    break;
                }
                if(sum%i==0){
					System.out.println(i+1);
					break;
                }
            }
        }
    }
}
