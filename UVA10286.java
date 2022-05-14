import java.util.*;
public class UVA10286 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int a =Integer.parseInt(sc.nextLine());
            String b =sc.nextLine();
            String s []= b.split(" ");
            int v =s.length-1;
            System.out.println(v);
            Long title =0l;
            int i= 0;
            while(v>0){
                if(v-1==0){
                    //System.out.println((Math.pow(Integer.parseInt(s[i])*(v),(1))));
                    title+=(int)(Math.pow(Integer.parseInt(s[i])*(v),(1)));
                }else if(v-1>0){
                    System.out.println((int)Math.pow(Integer.parseInt(s[i])*(v),(--v))*a);
                    title+=(int)Math.pow(Integer.parseInt(s[i])*(v),(--v))*a;
                }else{
                    break;
                }
                i++;
            }
            System.out.println(title);
        }
    }
}



