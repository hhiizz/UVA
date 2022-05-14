import java.util.*;
public class UVA10642 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.print("Case " + i + ": ");
            System.out.println(ss(x2, y2) - ss(x1, y1));
        }
        sc.close();
    }
    public static int ss(int x,int y){
        return ((x + y + 1) * (x + y + 2) / 2 - y);
    }
}
