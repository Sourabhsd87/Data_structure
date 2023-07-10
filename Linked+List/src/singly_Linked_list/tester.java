package singly_Linked_list;

public class tester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list SLL=new list();
		SLL.insertbyValue(10);
		SLL.insertbyValue(20);
		SLL.insertbyValue(30);
		SLL.insertbyValue(40);
		SLL.display();
		SLL.displayByrecursion(SLL.getHead());
		SLL.displayReverse();
		SLL.dislayreverseByrecursion(SLL.getHead());
		System.out.println();
		SLL.insertByPos(5, 50);
		SLL.display();
		//SLL.deleteByValue(50);
		//SLL.deleteByPos(5);
		SLL.reverseRecuesion(SLL.getHead(), SLL.getHead().getNext());
		//SLL.reverse();
		SLL.display();

	}

}
