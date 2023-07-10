package singly_Linked_list;

import java.util.Stack;

public class list {

	private Node head;
	
	public list() {
		this.head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	public boolean insertbyValue(int data) {
		Node nn=new Node(data);
		
		if(head==null) {
			head=nn;
			return true;
		}
		
		Node last=head;
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		
		last.setNext(nn);
		return true;
				
	}
	public void display() {
		Node temp=head;
		
		if(temp==null) {
			return;
		}
		
		while(temp!=null) {
			System.out.print(temp.getData()+" | ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	public void displayByrecursion(Node head) {
		if(head==null) {
			return;
		}
		
		System.out.print(head.getData());
		displayByrecursion(head.getNext());
		System.out.println();
	}
	public void displayReverse() {
		Node temp=head;
		Stack<Node> s=new Stack<Node>();
		
		if(temp==null) {
			return;
		}
		while(temp!=null) {
		s.push(temp);
		temp=temp.getNext();
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop().getData()+" | ");
		}
		System.out.println();
	}
	public void dislayreverseByrecursion(Node head) {
		if(head==null) {
			return;
		}
		dislayreverseByrecursion(head.getNext());
		System.out.print(head.getData()+" | ");
	}
	public boolean insertByPos(int pos,int data) {
		Node nn=new Node(data);
		if(pos<=0 || (head==null && pos>1)) {
			return false;
		}
		if(pos==1) {
			nn.setNext(head);
			head=nn;
			return true;
		}
		
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
			if(prev==null) {
				return false;
			}
		}
		nn.setNext(prev.getNext());
		prev.setNext(nn);
		return true;
	}
	public boolean deleteByValue(int data) {
		if(head==null) {
			return false;
		}
		
		if(data==head.getData()) {
			head=head.getNext();
			return true;
		}
		
		Node prev=head,del=head;
		while(del.getData()!=data) {
			prev=del;
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}
	public boolean deleteByPos(int pos) {
		if(head==null || pos<=0 ) {
			return false;
		}
		if(pos==1) {
			head=head.getNext();
			return true;
		}
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
			if(prev.getNext()==null) {
				return false;
			}
		}
		Node del=prev.getNext();
		prev.setNext(del.getNext());
		return true;
	}
	
	public void reverse() {
		if(head==null || head.getNext()==null) {
			return ;
		}
		Node n1=head,n2=head.getNext(),n3=null;
		while(n2!=null) {
			n3=n2.getNext();
			n2.setNext(n1);
			n1=n2;
			n2=n3;
		}
		head.setNext(null);
		head=n1;
	}
	public void reverseRecuesion(Node n1,Node n2) {
		if(n2==null) {
			head.setNext(null);
			head = n1;
			return ;
		}
		reverseRecuesion(n2, n2.getNext());
		n2.setNext(n1);
	}
	
}
