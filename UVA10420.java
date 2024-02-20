import java.security.KeyStore.Entry;
import java.util.*;
class UVA10420{//yes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String [] country =  new String [a+1];
        int [] count2 = new int [a+1];
        for(int i=0;i<country.length;i++){
            country[i]="0";
            count2[i]=0;
        }
        for(int i=0;i<a;i++){
            String counytryre = sc.nextLine().split(" ")[0];
            if(!Arrays.asList(country).contains(counytryre)){
                country[i]=counytryre;
                count2[i]=1;
            }else{
                for(int k = 0;k<country.length;k++){
                    if(country[k].equals(counytryre)){
                        count2[k]++;
                    }
                }
            }
        }
            for(int z =0;z<count2.length;z++){
                country[z]=country[z]+" "+count2[z];
            }
            Arrays.sort(country);
            for(String s:country){
                if(!s.equals("0 0"))
                    System.out.println(s);
            }
    }
}
/*
        Scanner sc = new Scanner (System.in);
        int a = Integer.parseInt(sc.nextLine());
        String [] ss = new String [a+1];
        for(int u=0;u<ss.length;u++){
            ss[u]="00";
        }
        int [] is = new int [a+1];
        for(int i=0;i<a;i++){
            String kk = sc.nextLine();
            String [] p = kk.split(" ");
            if(Arrays.asList(ss).contains(p[0])){
                for(int d =0;d<ss.length;d++){
                    if(ss[d].equals(p[0])){
                        is[d]++;
                        break;
                    }
                }
            }else{
                ss[i]=p[0];
                is[i]++;
            }
        }
        for(int i=0;i<ss.length;i++){
            ss[i]=ss[i]+" "+is[i];
        }
        Arrays.sort(ss);
        for(String k:ss){
            if(!(k.equals("00 0")))
            System.out.println(k);
        }

}

/*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String tm[]= new String [a+1];
        String df=" ";
        String b [] = new String [a+1];
        for(int i=0;i<=a;i++){
            b[i]=sc.nextLine();
            String [] z = b[i].split(" ");
            tm[i]=z[0];
        }
        Arrays.sort(tm);
        int number []= new int[tm.length];
        for(int i=0;i<tm.length;i++){
            for(int lk =0;lk<tm.length;lk++){
                if(tm[i].equals(tm[lk])&&i!=lk){
                    number[i]++;
                    tm[lk]="kk";
                }
            }
        }
        for(int i=1;i<tm.length;i++){
            if(tm[i]!="kk"){
                ++number[i];
                System.out.println(tm[i]+" "+number[i]);
            }


        }

*/