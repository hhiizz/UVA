import java.util.*;
public class UVA2_00255 {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    while(sc.hasNextLine()){
        String kq = sc.nextLine();
        String maze [][]= new String [8][8];
        int k=0;
        int km[]= new int [2];
        int qm[]= new int [2];
        String kqm [] = kq.split(" ");
        for(int i=0;i<maze.length;i++){
            for(int ik=0;ik<maze[0].length;ik++){
                if(maze[i][ik].equals(kqm[0])){
                    maze[i][k]="k";
                    km[0]=i;
                    km[1]=ik;
                    maze[i+1][k]="km";
                    maze[i-1][k]="km";
                    maze[i][k+1]="km";
                    maze[i][k-1]="km";
                }else if(maze[i][ik].equals(kqm[1])){
                    maze[i][k]="Q";
                    qm[0]=i;
                    qm[1]=ik;
                    for(int p=ik;p<maze[0].length;p++){
                        if(maze[i][p].equals("km")){
                            break;
                        }
                        maze[i][p]="qm";
                    }
                    for(int p=0;p<ik;p++){
                        if(maze[i][p].equals("km")){
                            break;
                        }
                        maze[i][p]="qm";
                    }
                    for(int p=0;p<i;p++){
                        if(maze[p][ik].equals("km")){
                            break;
                        }
                        maze[i][p]="qm";
                    }
                    for(int p=i;p<maze.length;p++){
                        if(maze[p][ik].equals("km")){
                            break;
                        }
                        maze[i][p]="qm";
                    }
                }else if(maze[i][ik].equals(kqm[2])){
                    maze[i][k]="Qm";
                }else if(maze[i][ik].equals("km")||maze[i][ik].equals("qm")){

                }
                else if(maze[i][ik]!="km"||maze[i][ik]!="qm"){
                    maze[i][ik]=k+"";
                }
                k++;
            }
        }
        if(kqm[0].equals(kqm[1])){
            System.out.println("Illegal state");
        }

    }
}
}
