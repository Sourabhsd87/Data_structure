package BubbleSort;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {54,25,48,53,76};
		Algorithm.bubbleSort(arr);
		System.out.print("Heap sort......")
		for(int i:arr) {
			System.out.print(i+",");
		}
	}

}
//25,48,53,54,76,
