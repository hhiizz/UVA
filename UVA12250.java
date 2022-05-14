import java.util.*;
public class UVA12250 {//ok

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNext()){
            String a=sc.next();
            if(a.equals("#"))break;
            list.add(a);
        }
        for(int i=0;i<list.size();i++){
            switch(list.get(i)){
                case "HELLO":
                    System.out.println("Case "+(i+1)+": ENGLISH");
                    break;
                case "HOLA":
                    System.out.println("Case "+(i+1)+": SPANISH");
                    break;
                case "HALLO":
                    System.out.println("Case "+(i+1)+": GERMAN");
                    break;
                case "BONJOUR":
                    System.out.println("Case "+(i+1)+": FRENCH");
                    break;
                case "CIAO":
                    System.out.println("Case "+(i+1)+": ITALIAN");
                    break;
                case "ZDRAVSTVUJTE":
                    System.out.println("Case "+(i+1)+": RUSSIAN");
                    break;
                default : System.out.println("Case "+(i+1)+": UNKNOWN");
            }
        }

    }
}
