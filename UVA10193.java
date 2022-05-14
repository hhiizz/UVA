import java.util.*;
public class UVA10193 {
    public static void main(String[] args) {//not time
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int z=1;z<=a;z++){
            Boolean yes = true;
            String s1 = sc.next();
            String s2 = sc.next();
            int a1 = Integer.parseInt(s1,2);
            int a2 = Integer.parseInt(s2,2);
            if(s1.charAt(0)=='0'||s1.length()==1||s2.length()==1||s2.charAt(0)=='0'){
                System.out.println("Pair #"+z+": Love is not all you need!");
                continue;
            }
            for(int i=2;i<=a2;i++){
                if(a1%i==0&&a2%i==0){
                    yes=false;
                    break;
                }
            }
            if(yes){
                System.out.println("Pair #"+z+": Love is not all you need!");
            }else{
                System.out.println("Pair #"+z+": All you need is love!");
            }
        }
    }

}
