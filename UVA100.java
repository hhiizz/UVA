import java.util.*;
class UVA100{
    public static void main(String[] args) {//OK
        Scanner sc  = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = 0;
            int max = 0;
            if(a>b){
                 max = a ;
                 min = b ;
                }else{
                max = b;
                min = a;
            }
            int count []= new int [max+1];
        for(int i=min;i<=max;i++){
            int x = i;
            while(x!=0){
                if(x==1){
                    count[i]++;
                    break;
                }
                if(x%2==0){
                    x = x/2;
                    count[i]++;
                }else{
                    x = 3*x+1;
                    count[i]++;
                }
            }
        }
        Arrays.sort(count);
        System.out.println(a+" "+b+" "+(count[max]));
        }
    }

}
// Scanner sc = new Scanner(System.in);
// while(sc.hasNextInt()){
//     int max ;
//     int min ;
//     int a =sc.nextInt();
//     int b =sc.nextInt();
//     if(a>b){
//         max = a ;
//         min = b ;
//     }else{
//         max = b;
//         min = a;
//     }
//     int count [] = new int [max-min+1];
//     for(int i=min;i<=max;i++){
//         int c = i;
//         while(c!=1){
//             count[max-i]++;
//             if(c%2==0){
//                 c=c/2;
//             }else{
//                 c=c*3+1;
//             }
//         }
//     }
//     Arrays.sort(count);
//     count[max-min]++;   //此處為加上當c=1部會判斷到
//     System.out.println(a+" "+b+" "+count[max-min]);
// }
//
 /*
                int max,low;
            int a =sc.nextInt();
            int b =sc.nextInt();
            if(a>b){
                max = a;
                low = b;
            }else{
                max = b;
                low = a;
            }
            int [] number =new int [max-low+1];
            for(int i=low;i<=max;i++){
                int c =i;
                while(c!=1){
                    if(c%2==0){
                        c = c/2;
                        number[max-i]++;
                    }else{
                        c= c*3+1;
                        number[max-i]++;
                    }
                }
            }
            Arrays.sort(number);
            number[max-low]++;
            System.out.println(a+" "+b+" "+number[max-low]);
    */
