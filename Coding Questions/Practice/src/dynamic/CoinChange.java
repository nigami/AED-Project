package dynamic;
import java.util.Scanner;
public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] denom = {25,10,5,1};
		int n =new Scanner(System.in).nextInt();
	    int [][] map= new int[n+1][denom.length];
		System.out.println(makeChange(n,  denom,  0,map));
	}

	
	public static int makeChange(int amt, int[] denom, int index, int[][]map){
		if(map[amt][index]>0)return map[amt][index];
		 if(index>=denom.length-1){
			return 1;
		}
		int way=0;
		for(int i=0; i*denom[index]<=amt;i++){
			way +=makeChange((amt-i*denom[index]),denom, index+1, map);
		}
		map[amt][index]=way;
		return way;
	}
	
}
