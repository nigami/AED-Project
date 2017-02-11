package bitManipulation;
import java.util.Scanner;
import java.util.ArrayList;

public class LongestOnesSeqByOneFlip {

	public static void main(String[]arg){
		System.out.println("Value Integer.BYTES*8 is "+Integer.BYTES*8);
		Scanner sa= new Scanner(System.in);
		System.out.println("Enter the integer");
		int input= sa.nextInt();
		
		System.out.println(flipbit(input));
		
	}
	
	public ArrayList<Integer> createSequence(int input){
		ArrayList<Integer> seq= new ArrayList<Integer>();
		int flag= 0;
		int count=0;
		for(int i=0;i<Integer.BYTES*8;i++){
			if((input &1)!=0){
				seq.add(count);
				flag= ~flag;
			}
			count++;
			input>>>=1;
		}
		return seq;
	}
	
	public static int flipbit(int a){
		if(~a==0) return 32;
		 int currlen =0;
		 int prelen=0;
		 int maxlen=0;
		 while(a!=0){
			 if((a&1)==1){
				 currlen++;
			}else if((a&1)==0){
				 prelen= (a&2)==0?0:currlen;
				 currlen=0;
				 
			}
			 maxlen=Math.max(prelen+currlen+1, maxlen);
			 a>>>=1;
		 }
		 
		return maxlen;
	}
	
}
