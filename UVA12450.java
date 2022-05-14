import java.util.*;
class UVA12450{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            int scarecrow = 0;
            int pp=0;
            int b =sc.nextInt();
            String as = sc.next();
            for(int k=0;k<as.length();k++){
                if(k!=as.length()-1&&as.charAt(k)=='.'&&as.charAt(k+1)=='.'){
                    scarecrow++;
                    k++;
                }
                if(k!=as.length()-1&&as.charAt(k)=='.'&&as.charAt(k+1)=='#'){
                    scarecrow++;
                    k++;
                }
                if(k!=0&&as.charAt(k)=='#'&&as.charAt(k+1)=='.'){
                    scarecrow++;
                    k++;
                }
            }

            System.out.println("Case "+i+": "+scarecrow);
        }
    }
}