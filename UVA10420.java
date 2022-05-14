import java.security.KeyStore.Entry;
import java.util.*;
class UVA10420{//ok
    public static void main(String[] args) {
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
}
/*
        Scanner sc = new Scanner(System.in);
        int a =Integer.parseInt(sc.nextLine());
        Map <String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<a;i++){
            String sd = sc.nextLine();
            String [] sas = sd.split(" ");
            if(map.get(sas[0])!=null){
                int jj = map.get(sas[0]);
                map.put(sas[0],++jj);
            }else{
                map.put(sas[0], 1);
            }
        }
        Set set = map.entrySet();
        Object [] aaaa = set.toArray();
        Arrays.sort(aaaa);
        for(Object o :aaaa){
            System.out.println(o+" "+map.get(o));
        }
        /*Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry=(Map.Entry)it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/

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