import java.util.*;
public class UVA10226 {//ok
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a=1;
        int fled = 0;
        while(a>0){
            if(fled++!=0)System.out.println("");
            int m=sc.nextInt();
            int n=sc.nextInt();
            if(n==0&&m==0)break;
            String io [] = new String[m+2];
            String ans [] []= new String [m+2][n+2];
            String map [] [] = new String [m+2][n+2];
            for(int i=1;i<io.length-1;i++){
                io[i]=" "+sc.next()+" ";
            }
            for(int i=0;i<map.length;i++){
                for(int k=0;k<map[0].length;k++){
                    map[i][k]="";
                }
            }
            for(int i=1;i<map.length-1;i++){
                for(int k=1;k<map[0].length-1;k++){
                map[i][k]=io[i].charAt(k)+"";
                }
            }
            for(int i=1;i<map.length-1;i++){
                for(int k=1;k<map[0].length-1;k++){
                    int count=0;
                    if(!(map[i][k].equals("*"))){
                        if(map[i][k-1].equals("*"))count++;
                        if(map[i-1][k-1].equals("*"))count++;
                        if(map[i-1][k].equals("*"))count++;
                        if(map[i-1][k+1].equals("*"))count++;
                        if(map[i][k+1].equals("*"))count++;
                        if(map[i+1][k+1].equals("*"))count++;
                        if(map[i+1][k].equals("*"))count++;
                        if(map[i+1][k-1].equals("*"))count++;
                        ans[i][k]=count+"";
                    }else{
                        ans[i][k]="*";
                    }
                }
            }
            System.out.print("Field #"+a+":");
            for(String[] o :ans){
                for(String p:o){
                    if(p!=null)
                    System.out.print(p);
                }
                System.out.println();
            }
            a++;
        }
    }
}
