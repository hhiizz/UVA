package cpe_12_15;
import java.util.*;

import java.util.*;
public class UVA948 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int fi [] = new int [39];
        fi[0] = 1;
        fi[1] = 2;
        for(int i=2;fi[i-1]<100000000;i++){
            fi[i] = fi[i-1]+fi[i-2];       
        }
        int count = sc.nextInt();
        for(int i=0;i<count;i++){
            int ans = sc.nextInt();
            System.out.print(ans);
            String ans_ans = "";
            boolean yes = false;
            for(int k=fi.length-1;k>=0;k--){
                if(yes){
                    if(fi[k]<=ans){
                        ans_ans+="1";
                        ans-=fi[k];
                    }else{
                        ans_ans+="0";
                    }
                }else{
                    if(fi[k]<=ans){
                        yes = true;
                        ans_ans+="1";
                        ans-=fi[k];
                    }
                }
            }
            System.out.println(" = "+ans_ans+" (fib)");
        }
    }
}
