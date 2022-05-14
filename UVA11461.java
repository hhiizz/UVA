import java.util.*;
class UVA11461{//ok
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b =sc.nextInt();
            if(a==0&&b==0)break;
            int count = 0;
            for(int i=1;i<=b;i++){
                if(Math.pow(i, 2)>=a&&Math.pow(i, 2)<=b)count++;
            }
            System.out.println(count);
        }
    }
}/*
Scanner sc = new Scanner(System.in);
while(sc.hasNextInt()){
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a==0&&b==0)break;
    int c = 0;
    for(int i=0;i<=b;i++){
        if(Math.pow(i, 2)>=a&&Math.pow(i,2)<=b)
            c++;
    }
    System.out.println(c);
}*/