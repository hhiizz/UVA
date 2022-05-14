import java.util.*;
class UVA10055{

    public static void main(String[] args) {//yes
        Scanner sc = new Scanner (System.in);
        while(sc.hasNextLong()){
            long  a = sc.nextLong();
            long  b = sc.nextLong();
            System.out.println(Math.abs(a-b));
        }
    }
}