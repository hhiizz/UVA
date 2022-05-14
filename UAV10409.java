import java.util.*;

public class UAV10409 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int a;
        while((a=sc.nextInt())!=0){
            int count=1;
            String dirction [] = new String [a];
            for(int i=0;i<a;i++){
                dirction[i]=sc.next();
            }
            for(int i=0;i<a;i++){
                switch(dirction[i]){
                    case "east":
                        if(count==1){
                            count=3;
                        }else if(count==6){
                            count=4;
                        }else if(count==2){
                            count=3;
                        }else if(count==3){
                            count=6;
                        }else if(count==4){
                            count=5;
                        }else if(count==5){
                            count=3;
                        }
                    break;
                    case "south":
                        if(count==1){
                            count=2;
                        }else if(count==6){
                            count=5;
                        }else{
                            count=1;
                        }
                    break;
                    case "west":
                        if(count==1){
                            count=4;
                        }else if(count==6){
                            count=3;
                        }else if(count==2){
                            count=3;
                        }else if(count==3){
                            count=1;
                        }else if(count==4){
                            count=2;
                        }else if(count==5){
                            count=4;
                        }
                    break;
                    case "north":
                        if(count==1){
                            count=5;
                        }else if(count==6){
                            count=2;
                        }else{
                            count=6;
                        }
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
