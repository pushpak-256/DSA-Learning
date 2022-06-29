package Sorting;

import java.util.Arrays;

/**
 * TC - O(n^2) - Quadratic SP 
 *  O(1) - Constant Unstable
 * 
 * Find Largest element, for each iteration, & swap it with last index of
 * unsorted part of Array
 * 
 * @author Pushpak Bhagat
 *
 */
public class InsertionSort {

	public static void insertionSort(int[] arr) {
		
		
		
		int firstIndexOfUnsorted = 1;  // assume 0 element is sorted part
		
		for (; firstIndexOfUnsorted < arr.length; firstIndexOfUnsorted++) {

			int curr = arr[firstIndexOfUnsorted];
		
			
			int insert =binarySerach(arr,curr,0,-1);
			int temp = arr[insert];
			
			int j = insert;
			for (;j<firstIndexOfUnsorted; j++) { // if curr < curr-1 , then only swap,
			
				arr[j] = arr[j- 1];
			}
			arr[j] = curr; // j is the Insertion position for curr element
			
		}
		
	}
	
	public static int binarySerach(int nums [] , int  curr, int low , int high) {
	   int mid = 0;
		while(low<=high) {
			mid = (low+high)>>>1;
			if(nums[mid]==curr) {high=mid-1;}
			else if(nums[mid]>curr) {high=mid-1;}
			else low =mid+1;
		}
		return low;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] { 4, 1, 3, 9, 7 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
