import java.util.*;
class UVA00272{//ok
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean test = true;
        while(sc.hasNextLine()){
            String getinput = sc.nextLine();
            for(int i=0;i<getinput.length();i++){
                if(test&&getinput.charAt(i)=='"'){
                    System.out.print("``");
                    test = false;
                }else if(!test&&getinput.charAt(i)=='"'){
                    System.out.print("''");
                    test = true;
                }else{
                    System.out.print(getinput.charAt(i));
                }
        }
            System.out.println(getinput);
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
