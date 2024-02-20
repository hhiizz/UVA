import java.util.*;
public class UVA11063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int countx = 1;
        while(sc.hasNextInt()){
            int count = 0;
            boolean yes = false;
            int a = sc.nextInt();
            int miax [] = new int [a];
            String totoal [] = new String [a*a];
            for(int i=0;i<miax.length;i++)miax[i]=sc.nextInt();
            for(int i=0;i<miax.length;i++){
                for(int k=i;k<miax.length;k++){
                    if(!Arrays.asList(totoal).contains((miax[i]+miax[k])+"")){
                        totoal[count++]=(miax[i]+miax[k])+"";
                    }else{
                        yes = true;
                        break;
                    }
                }
            }
            if(yes){
                System.out.println("Case #"+countx+": It is not a B2-Sequence.");

            }else{
                System.out.println("Case #"+countx+": It is a B2-Sequence.");
            }
            countx++;
            System.out.println();
        }
    }
}
