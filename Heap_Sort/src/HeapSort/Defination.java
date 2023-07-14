package HeapSort;

public class Defination {

	public static void heapSort(int [] arr,int len) {
		if(len<=1) {
			return;
		}
		
		for(int i=len-1;i>0;i--) {
			if(arr[i]>arr[(i-1)/2]) {
				int temp=arr[i];
				arr[i]=arr[(i-1/2)];
				arr[(i-1/2)]=temp;
			}
		}
		int temp=arr[0];
		 arr[0]=arr[len-1];
		arr[len-1]=temp;
		
		heapSort(arr, len-1);
	}
}
