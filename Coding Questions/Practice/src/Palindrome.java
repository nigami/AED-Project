import java.util.Scanner;
public class Palindrome {

	public static boolean findPalindrome(String input){
		if(input ==null) return true;
		int start=0;
		int end= input.length()-1;
		while(start<end){
			if(input.charAt(start)!=input.charAt(end)){
				return false;
			}
			start++;
			end--;
				
		}
		return true;
	}
	
	public static void main(String arg[]){
		Scanner sa= new Scanner(System.in);
		System.out.println(findPalindrome(sa.next()));
	}
}
