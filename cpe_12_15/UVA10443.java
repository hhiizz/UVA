package cpe_12_15;

import java.util.Scanner;

public class UVA10443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0;i<count;i++){
            int hi,ti,day;
            hi =sc.nextInt();ti= sc.nextInt();day =sc.nextInt();
            char mit [] [] = new char[hi+2][ti+2];
            char mit_copy [] [] = new char[hi+2][ti+2];
            for(int j =1;j<hi+1;j++){
                String z =sc.next();
                for(int k=1;k<ti+1;k++){
                    mit[j][k] = z.charAt(k-1);
                    mit_copy[j][k]  = mit[j][k] ;
                }
            }
            while(day-->0){
                for(int j =1;j<hi+1;j++){
                    for(int k=1;k<ti+1;k++){
                        if(mit[j][k] == 'R'){
                            if(mit_copy[j+1][k] == 'S')
                                mit_copy[j+1][k] = 'S';
                            if(mit_copy[j][k+1] == 'S')
                                mit_copy[j][k+1] = 'R';
                            if(mit_copy[j-1][k] == 'S')
                                mit_copy[j-1][k] = 'R';
                          if(mit_copy[j][k-1] == 'S')
                                mit_copy[j][k-1] = 'R';
                        }else if(mit[j][k] == 'S'){
                            if(mit_copy[j+1][k] == 'P')
                                mit_copy[j+1][k] = 'S';
                            if(mit_copy[j][k+1] == 'P')
                                mit_copy[j][k+1] = 'S';
                            if(mit_copy[j-1][k] == 'P')
                                mit_copy[j-1][k] = 'S';
                          if(mit_copy[j][k-1] == 'P')
                                mit_copy[j][k-1] = 'S';
                        }else if(mit[j][k] == 'P'){
                            if(mit_copy[j+1][k] == 'R')
                                mit_copy[j+1][k] = 'P';
                            if(mit_copy[j][k+1] == 'R')
                                mit_copy[j][k+1] = 'P';
                            if(mit_copy[j-1][k] == 'R')
                                mit_copy[j-1][k] = 'P';
                          if(mit_copy[j][k-1] == 'R')
                                mit_copy[j][k-1] = 'P';
                        }
                    }
                }
            }
            System.out.println();
            for(char [] o:mit_copy){
                for(char y:o){
                    if(y!='\0'){
                        System.out.print(y);
                    }
                }
                System.out.println();
            }
        }
    }
}
