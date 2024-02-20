import java.util.*;
class UVA10252{//yes
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            char [] a = sc.nextLine().toCharArray();
            char [] b = sc.nextLine().toCharArray();
            int max = 0;
            if(a.length>b.length){
                max = a.length;
            }else{
                max = b.length;
            }
            char []total =new char [max];
            for(int i=0;i<a.length;i++){
                for(int k=0;k<b.length;k++){
                    if(a[i]==b[k]){
                        total[i]=b[k];
                        b[k]='(';
                        break;
                    }
                }
            }
            Arrays.sort(total);
            for(char pl:total){
                if(pl!='\0')
                    System.out.print(pl);
            }
            System.out.println();
        }
    }
}

