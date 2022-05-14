import java.util.*;
public class UVA10190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while(sc.hasNextInt()){
            boolean yes =true;
            int a1 =sc.nextInt();
            int b = sc.nextInt();
            for(int i=1;i<a1;i++){
                if(Math.pow(b,i)==a1){
                    yes =false;
                    break;
                }
            }
            if(yes){
                System.out.println("Boring!");
            }else{
                while(true){
                    if(a1==1){
                        System.out.println(1);
                        break;
                    }
                    System.out.print(a1+" ");
                    a1/=b;
                }
            }
        }
    }
}
