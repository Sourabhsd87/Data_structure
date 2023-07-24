package heapSort;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {10,40,20,60,40,70};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" | ");
		}
		System.out.println();
		System.out.println("After Heap sort : ");
		
		algo.Heapsort(arr, arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" | ");
		}
	}

}
