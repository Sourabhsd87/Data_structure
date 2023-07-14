package MergeSort;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {54,25,48,53,76};
		Defination.mergeSort(arr, 0, arr.length-1);
		for(int i :arr) {
			System.out.print(i+",");
		}
	}

}
