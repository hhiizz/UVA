import java.util.*;
class UVA10041{// yes
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
            int total = 0;
            int x = sc.nextInt();
            int load [] = new int [x];
            for(int i=0;i<x;i++){
                load[i]=sc.nextInt();
            }
            Arrays.sort(load);
            int avg = load.length/2;
            for(int i =0;i<load.length;i++){
                total += Math.abs(load[i]-load[avg]);
            }
            System.out.println(total);
            a--;
        }
    }
}
