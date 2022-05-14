import java.text.DecimalFormat;
import java.util.*;
public class UVA10242 {//不相同+不相同-相同點
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while(sc.hasNextDouble()){
            double []x = new double[4];
            double []y = new double[4];
            double xx =0;
            double yy =0;
            double totx =0;
            double toty =0;
                for(int i=0;i<4;i++){
                    x[i]=sc.nextDouble();
                    y[i]=sc.nextDouble();
                }
                for(int i=0;i<4;i++){
                    for(int j=i;j<4;j++){
                        if(x[i]==x[j]&&y[i]==y[j]&&i!=j){
                            xx=x[j];
                            yy=y[j];
                        }
                    }
                }
                for(int i=0;i<4;i++){
                    if(x[i]!=xx||y[i]!=yy){
                        totx+=x[i];
                        toty+=y[i];
                    }
                }
                totx=totx-xx;
                toty=toty-yy;
                System.out.printf("%.3f %.3f ",totx,toty);
                System.out.println();
        }
    }
}
