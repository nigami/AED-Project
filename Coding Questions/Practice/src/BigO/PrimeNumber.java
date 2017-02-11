package BigO;
import java.util.Scanner;
public class PrimeNumber {
	
	public static boolean isPrime(int num){
		if(num<1){
			return false;
		}
		if(num==1){
			return true;
		}
		for(int i=2;i<=Math.sqrt(num);i++){ //Big O= O(sqrt(n))
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String arg[]){
		Scanner sa = new Scanner(System.in);
		int num= sa.nextInt();
		System.out.println(isPrime(num));
	}
}
