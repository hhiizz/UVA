import java.util.*;
class UVA11461{//yes
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int count =0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0&&b==0)break;
            for(int i=0;i<=b;i++){
                if(Math.pow(i,2)>=a&&Math.pow(i,2)<=b)count++;
            }
            System.out.println(count);
        }
    }
}
