import java.util.*;
class UVA12019{
    public static void main (String [] args){//ok
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0;i<count;i++){
            int month = sc.nextInt();
            int day =sc.nextInt();
            switch(month-1){
                case 11:
                    day+=30;
                case 10:
                    day+=31;
                case 9:
                    day+=30;
                case 8:
                    day+=31;
                case 7:
                    day+=31;
                case 6:
                    day+=30;
                case 5:
                    day+=31;
                case 4:
                    day+=30;
                case 3:
                    day+=31;
                case 2:
                    day+=28;
                case 1:
                    day+=31;
            }
            switch(day%7){
                case 0:
                System.out.println("Friday");
                break;
                case 1:
                System.out.println("Saturday");
                break;
                case 2:
                System.out.println("Sunday");
                break;
                case 3:
                System.out.println("Monday");
                break;
                case 4:
                System.out.println("Tuesday");
                break;
                case 5:
                System.out.println("Wednesday");
                break;
                case 6:
                System.out.println("Thursday");
                break;
            }
        }
    }
}
/*
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int m=sc.nextInt();
            int d=sc.nextInt();
            switch(m-1){
                case 11:
                    d+=30;
                case 10:
                    d+=31;
                case 9:
                    d+=30;
                case 8:
                    d+=31;
                case 7:
                    d+=31;
                case 6:
                    d+=30;
                case 5:
                    d+=31;
                case 4:
                    d+=30;
                case 3:
                    d+=31;
                case 2:
                    d+=28;
                case 1:
                    d+=31;
            }
            switch(d%7){
                case 0:
                System.out.println("Friday");
                break;
                case 1:
                System.out.println("Saturday");
                break;
                case 2:
                System.out.println("Sunday");
                break;
                case 3:
                System.out.println("Monday");
                break;
                case 4:
                System.out.println("Tuesday");
                break;
                case 5:
                System.out.println("Wednesday");
                break;
                case 6:
                System.out.println("Thursday");
                break;
            }

        }
*/