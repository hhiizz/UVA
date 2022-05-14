import java.util.*;
public class UVA10038 {//ok
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            boolean off = false;

            String s = sc.nextLine();
            String number [] = s.split(" ");
            String total ="";
            System.out.println(number.length-1);
            for(int i=1;i<number.length-1;i++){

                total+=Math.abs(Integer.parseInt(number[i])-Integer.parseInt(number[i+1]))+" ";
            }
            String [] sd =total.split(" ");
            Arrays.sort(sd);
            int min =1;
            List <String>ddd = Arrays.asList(sd);
            while(min<number.length-1){
                if(!ddd.contains(min+"")){
                    off=true;
                    break;
                }
                min++;
            }
            if(off){
                System.out.println("Not jolly");
            }else{
                System.out.println("Jolly");
            }

        }
    }
}

