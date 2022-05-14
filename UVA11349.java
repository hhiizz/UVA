import java.util.*;
public class UVA11349 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        int a =Integer.parseInt(sc.nextLine());
        for(int i=0;i<a;i++){
            String z = sc.nextLine();
            boolean yes = true;
            int num=z.charAt(4)-'0';
            Long count [][] = new Long [num][num];
            for(int p = 0;p<count[0].length;p++){
                String asss [] = sc.nextLine().split(" ");
                for(int p1 = 0;p1<count[0].length;p1++){
                    count[p][p1]=Long.parseLong(asss[p1]);
                }
            }

            if((num)%2==0){
                for(int l=0;l<2;l++){
                    if(l==0){
                        for(int o=0;o<count.length;o++){
                            if(count[o][o]!=count[(count.length-1)-o][(count.length-1)-o]){
                                yes=false;
                                break;
                            }
                        }
                    }else{
                        for(int o=0;o<count.length;o++){
                            if(count[o][(count.length-1)-o]!=count[(count.length-1)-o][o]){
                                yes=false;
                                break;
                            }
                        }
                    }

                }
            }else{
                for(int l=0;l<2;l++){
                    if(l==0){
                        for(int o=0;o<count.length;o++){
                            if(count[o][o]!=count[(count.length-1)-o][(count.length-1)-o]){
                                yes=false;
                                break;
                            }
                        }
                    }else{
                        for(int o=0;o<count.length;o++){
                            if(count[o][(count.length-1)-o]!=count[(count.length-1)-o][o]){
                                yes=false;
                                break;
                            }
                        }
                    }
                }
                for(int l=0;l<2;l++){
                    if(l==0){
                        for(int o=0;o<count.length;o++){
                            if(count[num/2][o]!=count[num/2][(count.length-1)-o]){
                                yes=false;
                                break;
                            }
                        }
                    }else{
                        for(int o=0;o<count.length;o++){
                            if(count[o][num/2]!=count[(count.length-1)-o][num/2]){
                                yes=false;
                                break;
                            }
                        }
                    }
                }
            }
            if(yes){
                System.out.println("Test #1: Symmetric.");
            }else{
                System.out.println("Test #2: Non-symmetric.");
            }
        }
    }
}
