import java.util.*;
public class UVA10409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int last =0;
        int me=1;
        String dection [] = new String[a];
        for(int i=0;i<a;i++){
            dection[i]=sc.next();
            if(i==0){
                if(dection[i].equals("north")){
                    last=me;
                    me=5;
                }else if(dection[i].equals("south")){
                    last=me;
                    me=2;
                }else if(dection[i].equals("west")){
                    last=me;
                    me=4;
                }else{
                    last=me;
                    me=3;
                }
            }else{

            }
        }

    }
}
