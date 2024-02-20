import java.util.*;

class UVA10062{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int np =0;
		while(sc.hasNextLine()){
			if((np++)!=0)System.out.println();
			String a = sc.nextLine();
			int asc [] = new int [128];
			String asc2 [] = new String [128];
			for(int i=0;i<a.length();i++){
				asc[a.charAt(i)]++;
			}
			for(int i=0;i<asc.length;i++)asc2[i] = "0 0";
			for(int i=0;i<asc.length;i++){
				if(asc[i]!=0)
					asc2[i]=i+" "+asc[i];
			}

			Arrays.sort(asc2,new Comparator<String>(){
				public int compare(String o1,String o2){
					if(Integer.parseInt(o1.split(" ")[1])!=Integer.parseInt(o2.split(" ")[1])){
						return Integer.parseInt(o1.split(" ")[1])-Integer.parseInt(o2.split(" ")[1]);
					}else{
						return Integer.parseInt(o2.split(" ")[0])-Integer.parseInt(o1.split(" ")[0]);
					}
				}
			});
			for(String u:asc2){
				if(!u.equals("0 0"))
				System.out.println(u);
			}

		}
	}
}