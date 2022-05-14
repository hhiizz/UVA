import java.util.*;
public class UVA11150 {//ok
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  cola;
        while(sc.hasNextInt()){
            cola =sc.nextInt();
            System.out.println(cola*3/2);
            int botter = cola;
            while(botter>=3){
                cola+=botter/3;
                botter=botter/3+botter%3;
            }
            if(botter==2)cola++;
            System.out.println(cola);
        }
    }
}
