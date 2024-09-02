package binarysearch;

public class SearchInASortedRotatedArray {
	
	/* Problem statement is the array is sorted after that the array might be rotated?
	 * Here the approach is have to eliminate one half and have to work on the
	 * other half to find the element is present or not in the array.
	 * 
	 * 1) Find the mid index, and check the mid index element is the element which we have to
	 * find or not, if that's the element we have to find then return an index of mid.
	 * 2) If not then check the arr[mid] element is greater, if it's greater than
	 * check arr[start] is lesser or equal, if that's the case then make end = mid - 1
	 * and start = start = 1, if arr[start] not equal to the element we have to find.
	 * 3) else, move start = mid + 1
	 * 4) If the element is not present then return -1.
	 */
	
	
	public static int searchInASortedArray(int[] arr, int ele) {
		int start = 0, end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] == ele)
				return mid;
			else if(arr[mid] > ele && arr[start] <= ele) {
				if(arr[start] == ele)
					return start;
				else 
                   start = start + 1; end = mid - 1;
			}
                else
                	start = mid + 1;   	 
			}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,200,300,400,10,20,30,40};
	    System.out.println("Index of an element is "+searchInASortedArray(arr, 200));

	}

}
