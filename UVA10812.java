import java.util.*;
class UVA10812{//ok
    public static void main(String[] args) {//yes
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(count-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<b){
                System.out.println("impossible");
            }else{
                int ans1 = (a+b)/2;
                int ans2 = a-ans1;
                if((ans1+ans2)==a && ans1>-1 && ans2>-1 && ans1-ans2==b)
                    System.out.println(ans1+" "+ans2);
                else
                    System.out.println("impossible");
            }
        }
    }
}
