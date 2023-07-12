package SelectionSort;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {54,25,48,53,76};
		Algorithm.selectionSort(arr);
		for(int i :arr) {
			System.out.print(i+",");
		}
	}

}
