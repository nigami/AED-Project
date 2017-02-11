
public class FinalReference {
	 public final SampleTwoArg twoArg=new SampleTwoArg();
	 public SampleTwoArg twoArg1= new SampleTwoArg();
	 
	 public FinalReference(String name, int id){
		 /* Reference cannot referred or
		  * cannot be alloted any 
		  * other heap space once declared final
		  * */
		 twoArg= twoArg1;
		 twoArg.setName(name);
		 twoArg.setId(id);
	}
	 
	 public static void main(String arg[]){
		 FinalReference fr= new FinalReference("ila",1);
		 System.out.println(fr.twoArg.getName());
		 fr= new FinalReference("aman",2);
		 System.out.println(fr.twoArg.getName());
	 }
	 
	 
}
