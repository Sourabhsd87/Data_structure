package MergeSort;

public class Defination {

//	public static void mergeSort(int [] arr,int left,int right) {
//		if(left>=right) {
//			return;
//		}
//		
//		int mid =(left+right)/2;
//		
//		mergeSort(arr, left, mid);
//		mergeSort(arr, mid+1, right);
//		merge(arr,left,mid,mid+1,right);
//	}
//	private static void merge(
//	int [] arr,
//	int leftstart,
//	int leftend,
//	int rightstart,
//	int rightend
//	) {
//		int noOfElem=rightend-leftstart+1;
//		int [] temparr=new int[noOfElem];
//		int tempPos=-1;
//		
//		while((leftstart<=leftend)&&(rightstart<=rightend)) {
//			if(arr[leftstart]<arr[rightstart]) {
//				temparr[++tempPos]=arr[leftstart];
//				leftstart++;
//			}
//			else {
//				temparr[++tempPos]=arr[rightstart];
//				rightstart++;
//			}
//		}
//		
//		while(leftstart<=leftend) {
//			temparr[++tempPos]=arr[leftstart];
//			leftstart++;
//		}
//		while(rightstart<=rightend) {
//			temparr[++tempPos]=arr[rightstart];
//			rightstart++;
//		}
//		
//		for(int i=1;i<=noOfElem;i++) {
//			arr[rightend]=temparr[tempPos];
//			rightend--;
//			tempPos--;
//		}
//	}
	public static void mergeSort(int [] arr,int left,int right) {
		if(left>=right) {
			return;
		}
		int mid=(left+right)/2;
		
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		merge(arr, left, mid, mid+1, right);
	}
	private static void merge(
			int [] arr,
			int leftstart,
			int leftend,
			int rightstart,
			int rightend
			) {
			
			int noOfelem=rightend-leftstart+1;
			int tempArr[] = new int [noOfelem];
			int temppod=-1;
			
			while((leftstart<=leftend)&&(rightstart<=rightend)) {
				if(arr[leftstart]<arr[rightstart]) {
					tempArr[++temppod]=arr[leftstart];
					leftstart++;
					}
				else {
					tempArr[++temppod]=arr[rightstart];
					rightstart++;
				}
			}
			
			while(leftstart<=leftend) {
				tempArr[++temppod]=arr[leftstart];
				leftstart++;
			}
			
			while(rightstart<=rightend) {
				tempArr[++temppod]=arr[rightstart];
				rightstart++;
			}
			
			for(int i = 1;i<noOfelem;i++) {
				arr[rightend]=tempArr[temppod];
				rightend--;
				temppod--;
			}
		
}
}
