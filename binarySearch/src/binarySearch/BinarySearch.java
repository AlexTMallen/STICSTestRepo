package binarySearch;
import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 4, 5, 6};
		int val = 3;
		System.out.println(BinarySearch.binSearch(arr, val));
	}
	
	public static int binSearch(int[] arr, int val) {
		// assumes arr is sorted ascending
		if (arr.length == 0 || arr.length == 1 && arr[0] != val) {
			return -1;
		} else {
			int check_loc = arr.length / 2;
			int recAnswer;
			if (arr[check_loc] == val) {
				return check_loc;
			} else if (val > arr[check_loc]) {
				recAnswer = BinarySearch.binSearch(Arrays.copyOfRange(arr,  check_loc + 1,  arr.length), val);
				if (recAnswer == -1) {
					return -1;
				}
				recAnswer += check_loc + 1;
			} else {
				recAnswer = BinarySearch.binSearch(Arrays.copyOfRange(arr,  0,  check_loc), val);
			}
			return recAnswer;
		}
	}
}
