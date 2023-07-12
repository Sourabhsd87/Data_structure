package Binary_search;

public class defination {

	public static int bSearch(int arr[],int key) {
		
		int left=0,right=arr.length-1;
		int mid=0;
		
		while(left<=right) {
			mid=(left+right)/2;
			if(key==arr[mid]) {
				return mid;
			}
			if(key<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return 999;
	}
	
	public static int bsearch(int arr[],int left,int right,int key) {
		if(left>right) {
			return 999;
		}
		int mid=(left+right)/2;
		if(arr[mid]==key) {
			return mid;
		}
		if(arr[mid]>key) {
			return bsearch(arr, left, mid-1, key);
		}
		else {
			return bsearch(arr, mid+1, right, key);
		}
		
	}
}
