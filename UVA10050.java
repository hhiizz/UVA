import java.util.*;
public class UVA10050 {
    public static void main(String []args){//Ok
        Scanner sc = new Scanner(System.in);
        int pp =sc.nextInt();
        while(pp-->0){
            int countday=2;
            int count =0;
            int fri = 6;
            int day = sc.nextInt();
            int [] m = new int [day+1];

            int pop[] =new int[sc.nextInt()];
            for(int i=0;i<pop.length;i++){
                pop[i]=sc.nextInt();
            }
            for(int i=1;i<m.length;i++){
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
/*
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        for(int i=0;i<a;i++){
            int day = sc.nextInt();
            int politicalparty = sc.nextInt();
            int politicalday [] = new int [politicalparty];
            for(int k=0;k<politicalparty;k++){
                politicalday[k]= sc.nextInt();
            }
            int week=1;
            int workday=0;
            while(day>=week){
                for(int o=0;o<politicalday.length;o++){
                    if(week%politicalday[o]==0&&week%7!=0&&week%7!=6){
                        //System.out.println(week);
                        workday++;
                        break;
                    }
                }
                week++;
            }
            System.out.println(workday);
        }
*/
