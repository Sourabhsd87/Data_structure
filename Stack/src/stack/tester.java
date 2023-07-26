package stack;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack<Integer> s = new Stack<Integer>(2);
//		System.out.println(s.push(2));
//		s.push(5);
//		System.out.println(s.push(9));
//		
//		System.out.println(s.peek());
//		
//		System.out.println(s.pop());
//		s.pop();
//		System.out.println(s.pop());
//		
		DoubleStack ds = new DoubleStack(2);
		System.out.println(ds.push1(1));
		System.out.println(ds.push2(1));
		System.out.println(ds.push1(2));
		System.out.println();
		System.out.println(ds.pop1());
		System.out.println(ds.pop2());
		System.out.println(ds.pop1());
		
	}

}
