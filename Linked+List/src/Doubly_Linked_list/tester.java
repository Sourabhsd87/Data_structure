package Doubly_Linked_list;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dlist list=new Dlist();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.display();
		list.insertBypos(60, 6);
		list.display();
		//list.delByValue(50);
		list.delBypos(6);
		list.display();
		
	}

}
