import java.util.Scanner;
public class StringCompression {

	public static String stringCompression(String input){
		if(input==null)return null;
		if(input.length()==1){
			return input+1;
		}
		int count=1;
		StringBuilder output = new StringBuilder();
		for(int i=1;i<input.length();i++){
			if(input.charAt(i-1)!=input.charAt(i)){
				output.append(input.charAt(i-1)).append(count);
				count=0;
			}
			count++;
			if((i+1)==input.length()){
				output.append(input.charAt(i)).append(count);
			}
			
		}
		return (output.toString().length()>input.length()?input:output.toString());
	}
	
	public static void main(String arg[]){
		
		Scanner sa= new Scanner(System.in);
		String input = sa.next();
		System.out.println(stringCompression(input));
	}
}
