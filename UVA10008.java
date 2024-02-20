import java.util.*;
public class UVA10008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a [] = new int [100];
        String x [] = new String [100];
        for(int i=0;i<x.length;i++)
            x[i]="0 0";
        int b = Integer.parseInt(sc.nextLine());
        while(b-->0){
            String getstr = sc.nextLine().toUpperCase();
            for(int i=0;i<getstr.length();i++){
                if((getstr.charAt(i))>='A' && (getstr.charAt(i))<='Z'){
                    a[getstr.charAt(i)-'0']++;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0)
                x[i]=(char)(i+'0')+" "+a[i];
        }
        Arrays.sort(x,new Comparator<String>(){
            public int compare(String o1,String o2){
                return Integer.parseInt(o2.split(" ")[1])-Integer.parseInt(o1.split(" ")[1]);
            }
        });
        for(String d :x)
            if(!d.equals("0 0"))
                System.out.println(d.split(" ")[0]+" "+d.split(" ")[1]);

        // 3
        // This is a test.
        // Count me 1 2 3 4 5.
        // Wow!!!! Is this question easy?

    }
}
// class iii implements Comparator<List>{//此處泛行給的是你要比的資料如果list中還包著list或其他類則此處就用此類
//     public int  compare(List s1,List s2){
//         return 1;
//     }
// }
// int c[] = new int[300];
// int a = Integer.parseInt(sc.nextLine());
// for(int i=0;i<a;i++){
//     String jj=sc.nextLine();
//     jj=jj.toUpperCase();//轉大寫
//     for(int k =0;k<jj.length();k++){
//         if(jj.charAt(k)>='A'&&jj.charAt(k)<='Z'||jj.charAt(k)>='a'&&jj.charAt(k)<='Z')
//             c[(int)jj.charAt(k)]++;
//     }
// }
// String [] oop = new String [300];
// for(int i=0;i<oop.length;i++){
//     oop[i]="0 0";
// }
// for(int m=0;m<c.length;m++){
//     if(c[m]!=0)oop[m]=((char)m+" "+c[m]);
// }
// //Collections.sort(list,new);
// Arrays.sort(oop, new Comparator<String>() {
//     public int compare(String s1,String s2){
//         String [] ss1 = s1.split(" ");
//         String [] ss2 = s2.split(" ");
//         return Integer.parseInt(ss2[1])-Integer.parseInt(ss1[1]);
//     }
// });
// for(String d:oop)
//     if(!d.equals("0 0"))System.out.println(d);
// }



