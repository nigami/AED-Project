package LinkedList;
import java.util.HashSet;
public class RemoveDups {
		
	public static ListNode removeDups(ListNode head){
		
		if(head==null)return null;
		if(head.next==null) return head;
		
		HashSet<Integer> hset =new HashSet<Integer>();
		ListNode node = head;
		while(node.next!=null){
			if(hset.contains(node.next.data)){
				node.next= node.next.next;
			}else{
				hset.add(node.next.data);
			}
			node=node.next;
		}
		
		return head;
	}
	  public static ListNode reverseList(ListNode head){
	        if(head==null) return new ListNode(0);
	        ListNode node =reverseList(head.next);
	        ListNode top= node;
	        while(node.next!=null){
	        	node= node.next;
	        }
	        node.next=new ListNode(head.data);
	     
	        return top;
	    }
	  
	  public static boolean isPalindrome(ListNode head) {
	        //1,2,3,3,2,1
	        //1,2,3,2,1
	        if(head==null)return true;
	        ListNode newHead=head;
	        ListNode reversed= reverseList(head);
	        while(newHead.next!=null){
	            if(reversed.data!=newHead.data){
	                return false;
	            }
	            newHead=newHead.next;
	            reversed= reversed.next;
	        }
	        
	        return true;
	    }
	  
	public static void main(String [] arg){
		ListNode l= new ListNode(1);
		l.next=new ListNode(0);
		
		l.next.next=new ListNode(1);
		//l.next.next.next=new ListNode(1);
		//l.next.next.next.next=new ListNode(4);
		//l.next.next.next.next.next=new ListNode(0);
		//l.next.next.next.next.next.next=new ListNode(3);	
		
		//l=removeDups(l);
		//System.out.println("l.data"+l);
		//System.out.println(l.data);
		
		l=reverseList(l);
		System.out.println(isPalindrome(l));
		while(l.next!=null){
			System.out.println(l.next.data);
			l=l.next;
		}
		
		
	}
}
