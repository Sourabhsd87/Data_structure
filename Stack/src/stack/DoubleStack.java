package stack;

public class DoubleStack {
	private int size;
	private int arr[];
	private int top1,top2;

	public DoubleStack(int size) {
		this.size=size;
		this.top1=-1;
		this.top2=size;	
		arr = new int [size];
	}
	public boolean isEmpty1() {
		if(top1==-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty2() {
		if(top2==size) {
			return true;
			
		}
		return false;
	}
	
	public boolean isFull() {
		return (top1+1)==top2;
	}
	
	public boolean push1(int data) {
		if(isFull()) {
			return false;
		}
		arr[++top1]=data;
		return true;
	}
	public boolean push2(int data) {
		if(isFull()) {
			return false;
		}
		arr[--top2]=data;
		return true;
	}
	public int pop1() {
		if(isEmpty1()) {
			return -1;
		}
		return arr[top1--];
	}
	public int pop2() {
		if(isEmpty2()) {
			return -1;
		}
		return arr[top1++];
	}
}

