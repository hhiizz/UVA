import java.util.*;
class UVA10235{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	while(sc.hasNext()){
        boolean yes = true;
        Boolean yese = true;
        String a = sc.next();
        String b ="";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        int z = Integer.parseInt(a);
        for(int i =2;i<=z/2;i++){
            if(z%i==0){
                yes = false;
                break;
            }
        }
        int z2 = Integer.parseInt(b);
        for(int i =2;i<=z2/2;i++){
            if(z2%i==0){
                yese = false;
                break;
            }
        }
        if(yes && yese && !a.equals(b) ){
            System.out.println(a+" is emirp.");

        }else if(yes){
            System.out.println(a+" is prime.");
        }else{
            System.out.println(a+" is not prime.");
        }

	}
}
}
/*
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a =sc.next();
            boolean yes =false;
            String ans="";
            int aa =Integer.parseInt(a);
            for(int i=2;i<aa;i++){
                if(aa%i==0){
                    yes=true;
                    break;
                }
            }
            if(yes){
                System.out.println(a+" is not prime.");
            }else{
                for(int i=a.length()-1;i>=0;i--){
                    ans+=a.charAt(i);
                }
                if(ans.equals(a)){
                    System.out.println(a+" is prime.");
                }else{
                    int d =Integer.parseInt(ans);
                    for(int i=2;i<d;i++){
                        if(d%i==0){
                            yes =true;
                            break;
                        }
                    }
                    if(yes){
                        System.out.println(a+" is prime.");
                    }else{
                        System.out.println(a+" is emirp.");
                    }
                }
            }
        }
*/
