package binarysearch;

public class IndexOfFirstOccurrence {
	/*
	 * 1) First find the mid position and check arr[mid] == 1, if that's the case
	 *    check that mid index is zero, if, that's the case then return index
	 *    or check arr[mid-1] != 1, then also return the mid index
	 * 2) if arr[mid -1] == 1, then move the end pointer to mid - 1 position.
	 * 3) if arr[mid] != 1, then move the start pointer to mid + 1 position
	 * 4) If the 1 is not present in the array then return -1.
	 */
	
	public static int indexOfFirstOccurrence(int[] arr) {
		int start = 0, end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] != 1)
				start = mid + 1;
			else
				if(mid == 0 || arr[mid - 1] != 1)
					return mid;
				else
					end = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {1,1,1,1,1,1};
       System.out.println("First Index position is "+indexOfFirstOccurrence(arr));
	}

}
