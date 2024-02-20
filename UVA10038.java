import java.util.*;


public class UVA10038 {//ok
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            boolean yes = false;
            int a = sc.nextInt();
            int number [] = new int [a];
            String count = "";
            for(int i=0;i<a;i++){
                number[i]=sc.nextInt();
            }
            int low [] = new int [a-1];
            for(int i=0;i<a-1;i++){
                low[i] = Math.abs(number[i]-number[i+1]);
            }
            if(a!=1){
                Arrays.sort(low);
                for(int i=0;i<low.length;i++){
                    if(low[i]!=i+1){
                        yes = true;
                        break;
                    }
                }
            }
            if(yes){
                System.out.println("Not jolly");
            }else{
                System.out.println("Jolly");
            }
        }
    }
}

