import java.util.*;
public class UVA11734 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String b1 = sc.nextLine();
            String b2 = sc.nextLine();
            System.out.print("Case " + i + ": ");
            if(!(b1.equals(b2))){
                b1=b1.replace(" ", "");
                b2=b2.replace(" ", "");
                if(b1.equals(b2)){
                    System.out.println("Output Format Error");
                }else{
                    System.out.println("Wrong Answer");
                }
            }else{
                System.out.println("Yes");
            }
        }
    }
}
