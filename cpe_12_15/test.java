package cpe_12_15;

import java.util.Arrays;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        int [] o = new int [2];
        int [] i = o.clone();
        long zzr = Arrays.stream(o).filter(x -> 97l).count();
        HashMap <Integer,String> oo = new HashMap<Integer,String>();
        oo.put(123, "zzz");
        oo.put(432,"osda");
        oo.put(1234,"sz");
        for(int z:oo.keySet()){
            System.out.println(z+" "+oo.get(z));
        }
        System.out.println(oo.get(123));
    }
}
