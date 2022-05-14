import java.util.*;
public class UVA10415 {
    public static void main(String[] args) {//ok
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        for(int i=0;i<u;i++){
            String a ;
            int finger [] = new int[11];
            boolean[] fing = new boolean[11];
                a=sc.next();
                if(a.equals("")){
                    for(int l=1;l<finger.length;l++){
                        System.out.print(finger[l]+" ");
                    }
                    System.out.println();
                }else{
                    for(int k=0;k<a.length();k++){
                        switch(a.charAt(k)){
                            case 'c':
                            for(int o=1;o<finger.length;o++){
                                if((o>=2&&o<=4)||(o>=7&&o<=10)){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                                break;
                            case 'd':
                            for(int o=1;o<finger.length;o++){
                                if((o>=2&&o<=4)||(o>=7&&o<=9)){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'e':
                            for(int o=1;o<finger.length;o++){
                                if((o>=2&&o<=4)||(o>=7&&o<=8)){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'f':
                            for(int o=1;o<finger.length;o++){
                                if((o>=2&&o<=4)||(o==7)){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'g':
                            for(int o=1;o<finger.length;o++){
                                if((o>=2&&o<=4)){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'a':
                            for(int o=1;o<finger.length;o++){
                                if((o>=2&&o<=3)){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'b':
                            for(int o=1;o<finger.length;o++){
                                if(o==2){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'C':
                            for(int o=1;o<finger.length;o++){
                                if(o==3){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'E':
                            for(int o=1;o<finger.length;o++){
                                if((o>=1&&o<=4)||(o>=7&&o<=8)){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'D':
                            for(int o=1;o<finger.length;o++){
                                if((o>=1&&o<=4)||(o>=7&&o<=9)){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'F':
                            for(int o=1;o<finger.length;o++){
                                if((o>=1&&o<=4)||(o==7)){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'G':
                            for(int o=1;o<finger.length;o++){
                                if(o>=1&&o<=4){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'A':
                            for(int o=1;o<finger.length;o++){
                                if(o>=1&&o<=3){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                            case 'B':
                            for(int o=1;o<finger.length;o++){
                                if(o>=1&&o<=2){
                                    if(fing[o]==false){
                                        finger[o]++;
                                        fing[o]=true;
                                    }
                                }else{
                                    fing[o]=false;
                                }
                            }
                            break;
                        }
                    }
                    for(int l=1;l<finger.length;l++){
                        System.out.print(finger[l]+" ");
                    }
                    System.out.println();
                }
            }
        }
}
