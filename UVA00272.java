import java.util.*;
class UVA00272{//yes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean yes = true;
        while(sc.hasNext()){
            String a = sc.nextLine();
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)=='"'){
                    if(yes){
                        System.out.print("``");
                        yes = !yes;
                    }else{
                        System.out.print("''");
                        yes = !yes;
                    }
                }else{
                        System.out.print(a.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
/*


*/
/*
        Scanner sc = new Scanner (System.in);
        int c = 1;
        while(sc.hasNextLine()){
            String a =sc.nextLine();
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)!='"'){
                    System.out.print(a.charAt(i));
                }else if(c%2!=0){
                    c++;
                    System.out.print("``");
                }else{
                    c++;
                    System.out.print("''");
                }
            }
            System.out.println();
        }
*/
