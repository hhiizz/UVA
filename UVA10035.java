import java.util.*;
class CPE100035{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//yes
        while(sc.hasNextInt()){
            int number =0;
            int c =0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0&&b==0)break;
            while(a > 0 || b > 0){
                int x =a%10+b%10+c;
                c=0;
                if(x>=10){
                    number++;
                    c++;
                }
                a=a/10;
                b=b/10;
            }
            if(number==0){
                System.out.println("No carry operation.");
            }else if(number==1){
                System.out.println(number+" carry operation.");
            }else{
                System.out.println(number+" carry operations.");
            }
        }
        }
}


