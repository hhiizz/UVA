import java.util.*;
class UVA10235{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	while(sc.hasNextInt()){
		boolean yes =true;
        boolean yes2 =true;
		int a =sc.nextInt();
		for(int i=2;i<a;i++){
			if(a%i==0){
                yes =false;
            }
		}
        String ss = a+"";
		String b="";
		for(int i=ss.length()-1;i>=0;i--){
            b+=ss.charAt(i)-'0';
		}
        if(a==Integer.parseInt(b))yes2=false;
		int c = Integer.parseInt(b);
		for(int i=2;i<c;i++){
			if(c%i==0){
                yes2 =false;
            }
		}

		if(yes&&yes2){
			System.out.println(a+" is emirp.");
		}else if(yes&&!yes2){
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
