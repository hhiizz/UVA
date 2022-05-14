import java.util.Scanner;
class UVA00490{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] t = new char [101][101];
        int max =0;
        int line =0;
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            max  =(s.length()>max)? s.length():max;
            for(int i=0;i<s.length();i++)
                t[line][i]=s.charAt(i);
            line++;
        }
        for(int i=0;i<max;i++){
            for(int k=line-1;k>=0;k--){
                if(t[k][i]=='\0'){
                    System.out.print(" ");
                }else{
                    System.out.print(t[k][i]);
                }
            }
            System.out.println();
        }
    }
    /*
            String a =sc.nextLine();
        String b =sc.nextLine();
        while(true){
            if(a.length()==b.length()){
                break;
            }else if(a.length()>b.length()){
                b+=" ";
            }else{
                a+=" ";
            }
        }
        for(int i=0;i<a.length();i++){
            System.out.println(b.charAt(i)+""+a.charAt(i));
        }
    */
}