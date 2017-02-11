package puzzle;
import java.util.Random;
import java.util.Scanner;
public class GenderRatio {

	public class Gender{
		int boy;
		int girl;
		
		public void setGirl(int girl){
			this.girl=girl;
		}
		
		public int getGirl(){
			return this.girl;
		}
		
		public void setBoy(int boy){
			this.boy=boy;
		}
		
		public int getBoy(){
			return boy;
		}
	}
	
	public  Gender getFamilyGender(){
		Gender gender = new Gender();
		Random r= new Random();
		boolean girls ;
		int girl=0,boy=0;
		while(girl==0){
			 girls = r.nextBoolean();
			if(girls==false){
				boy++;
			}else{
				girl++;
			}
		}
		gender.setBoy(boy);
		gender.setGirl(girl);
		return gender;
	}
	
	public double familyRatio(int n){
		int i=0;
		int girl=0,boy=0;
		while(i<n){
			Gender gen= getFamilyGender();
			girl+=gen.getGirl();
			boy+=gen.getBoy();
			i++;
		}
		System.out.println(girl+" "+boy);
		return (girl/(boy+girl));
	}
	
	@SuppressWarnings("resource")
	public static void main(String arg[]){
		Scanner sa= new Scanner(System.in);
		while(sa.hasNext()){
			int countPop= sa.nextInt();
			GenderRatio gr= new GenderRatio();
			
			System.out.println("Ratio:"+gr.familyRatio(countPop));
		}
		
		System.out.println("Thank you");
		
	}
}
