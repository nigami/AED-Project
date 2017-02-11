
public class URLEncoding {

	public static void main(String[] arg){
		String input = new String("I M FINE");
		char [] inputchar= input.toCharArray();
		inputchar=urlencoding(inputchar,12);
		System.out.println(inputchar);
		
		
	}
	public static char[] urlencoding(char[] input, int num){
		int space=0;
		for(char i: input){
			if(i==' '){
				space++;
			}
		}
		
		int index = input.length+2*space;
		char []output= new char[index];
		if(index<num){
			output[index]='\0';
		}
		for(int i=input.length-1; i>=0; i--){
			if(input[i]==' '){
				output[index-1]='0';
				output[index-2]='2';
				output[index-3]='%';
				index-=3;
			}else{
				output[index-1]=input[i];
				index=index-1;
			}
		}
		return output;
	}
}
