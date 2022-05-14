import java.util.*;
public class UVA11063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ccount = 1;
        while(sc.hasNextInt()){
        boolean test = true;
        int a =sc.nextInt();
        String number [] = new String [a];
        String donumber [] = new String [2000];
        int count =0;
        for(int i=0;i<a;i++){
            number[i] = sc.next();
        }
        for(int i=0;i<number.length;i++){
            for(int k=i;k<number.length;k++){
                String s =(Integer.parseInt(number[i])+Integer.parseInt(number[k]))+"";
                System.out.println(s);
                if(!Arrays.asList(donumber).contains(s)){
                    donumber[count++]=s;
                }else{
                    test = false;
                    break;
                }
            }
        }
        if(test){
            System.out.println("Case #"+ccount+": It is a B2-Sequence.");
        }else{
            System.out.println("Case #"+ccount+": It is not a B2-Sequence.");
        }
        System.out.println();
        ccount++;
    }
    }
}
