import java.util.*;
public class UVA10050 {
    public static void main(String []args){//yes
        Scanner sc = new Scanner(System.in);
        int pp =sc.nextInt();
        while(pp-->0){
            int countday=2;
            int count =0;
            int fri = 6;
            int day = sc.nextInt();

            int pop[] =new int[sc.nextInt()];
            for(int i=0;i<pop.length;i++){
                pop[i]=sc.nextInt();
            }
            for(int i=1;i<day+1;i++){
                if(i%fri==0){
                    fri=(6*countday)+countday-1;
                    countday++;
                    continue;
                }
                if(i%7==0)continue;
                    for(int k=0;k<pop.length;k++){
                        if(i%pop[k]==0){
                            count++;
                            break;
                    }
                }
            }
            System.out.println(count);

        }

    }
}
