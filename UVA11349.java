import java.util.*;
class UVA11349{
    public static void main(String [] args){ //yes
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        for(int i=1;i<=a;i++){
            sc.next();
            sc.next();
            int sd = Integer.parseInt(sc.next());
            int o =sd*sd;
            long x [] = new long [o];
            for(int k =0;k<x.length;k++)x[k] = Long.parseLong(sc.next());
            boolean yes = false;
            for(int k=0;k<o;k++){
                if(x[k]<0 || x[k]!=x[x.length-1-k]){
                    yes = true;
                    break;
                }
            }
            if(!yes){
                System.out.println("Test #"+i+": Symmetric.");
            }else{
                System.out.println("Test #"+i+": Non-symmetric.");
            }
        }
    }
}