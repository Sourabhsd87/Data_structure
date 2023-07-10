package Doubly_Linked_list;

public class Dlist {

	private Node head;
	public Dlist() {
		this.head=null;
	}
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public boolean insert(int data) {
		Node nn=new Node(data);
		
		if(head==null) {
			head=nn;
			return true;
		}
		
		Node last=head;
		while(last.getNext()!=null) {
			last=last.getNext();
			if(last==null) {
				return false;
			}
		}
		last.setNext(nn);
		nn.setPrev(last);
		return true;
	}
	public void display() {
		if(head==null) {
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+"|");
			temp=temp.getNext();
		}
		System.out.println();
	}
	public boolean insertBypos(int data ,int pos) {
		if(pos<=0 || (head==null && pos>1)) {
			return false;
		}
		Node nn = new Node(data);
		if(pos==1) {
			if(head!=null) {
				nn.setNext(head);
				head.setPrev(nn);
			}
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
		Node nxt=prev.getNext();
		if(nxt!=null) {
			nn.setNext(nxt);
			nxt.setPrev(nn);
		}
		prev.setNext(nn);
		nn.setPrev(prev);
		return true;
	}
	public boolean delByValue(int data) {
		if(head==null) {
			return false;
		}
		if(head.getData()==data) {
			head=head.getNext();
			if(head!=null) {
				head.setPrev(null);
			}
			return true;
		}
		Node del=head;
		while(del.getData()!=data) {
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		Node prev=del.getPrev();
		Node next=del.getNext();
		prev.setNext(next);
		if(next!=null) {
			next.setPrev(prev);
		}
		return true;
	}
	public boolean delBypos(int pos) {
		if(pos<=0 || head==null) {
			return false;
		}
		if(pos==1) {
			head=head.getNext();
			if(head!=null) {
				head.setPrev(null);
			}
			return true;
		}
		Node del=head;
		for(int i=1;i<pos;i++) {
			del=del.getNext();
			if(del==null) {
				return false;	
			}
		}
		Node prev = del.getPrev();
		Node next = del.getNext();
		prev.setNext(next);
		if(next!=null) {
			next.setPrev(prev);
		}
		return true;
	}
}
