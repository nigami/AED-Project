import java.util.EmptyStackException;


public class StackMin {
	Node top;
	
	public class Node{
		int data;
		int min;
		Node next;
		
		public Node(int data, int min){
			this.data = data;
			this.min=min;
		}
	}
	
	public void push(int num){
		if(min()>num){
			top.min=num;
		}
		Node node = new Node(num,top.min);
		node.next=top;
		top=node;
	}
	
	public  int min(){
		if(top==null){
			return Integer.MAX_VALUE;
		}
		return peek().min;
		
	}
	
	public Node peek(){
		if(top==null){
			throw new EmptyStackException();
		}
		return top;
	}
	
	public Node pop(){
		
		return top;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
