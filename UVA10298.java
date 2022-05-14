import java.text.BreakIterator;
import java.util.*;
public class UVA10298 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String name = sc.nextLine();
            StringBuilder str = new StringBuilder();
            if(name.equals("."))break;
            //str.append(name.charAt(0));
            for(int i=1;i<name.length();i++){
                if(name.charAt(0)!=name.charAt(i)){
                    str.append(name.charAt(i));
                }else{
                    break;
                }
            }
            String asdsa =str.toString();
            System.out.println(asdsa);
            String sdasd []= name.split(asdsa);

            System.out.println(sdasd.length);
        }
    }
}
