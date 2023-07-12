package Linear_search;

public class Linear_defination {

	public static int linearSearch(int [] arr,int key) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==key)
				return i+1;
		}
		return 999;
	}
}
