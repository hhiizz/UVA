import java.util.Scanner;
class UVA00490{//yes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] t = new char [101][101];
        int max = 0;
        int line = 0;
        while(sc.hasNextLine()){
            String u = sc.nextLine();
            if(u.length()>max)max = u.length();
            for(int i=0;i<u.length();i++){
                t[line][i]= u.charAt(i);
            }
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
}




















// char [][] t = new char [101][101];
// int max =0;
// int line =0;
// while(sc.hasNextLine()){
//     String s = sc.nextLine();
//     max  =(s.length()>max)? s.length():max;
//     for(int i=0;i<s.length();i++)
//         t[line][i]=s.charAt(i);
//     line++;
// }
// for(int i=0;i<max;i++){
//     for(int k=line-1;k>=0;k--){
//         if(t[k][i]=='\0'){
//             System.out.print(" ");
//         }else{
//             System.out.print(t[k][i]);
//         }
//     }
//     System.out.println();
// }