package Sorting;

import java.util.Arrays;

/**
 * TC - O(n^2) - Quadratic SP - O(1) - Constant
 * 
 * @author Pushpak Bhagat
 *
 */
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		if (arr.length == 1)
			return;
		int i = 0, j = arr.length - 1;
		while (i < j) {
			i = 0;
			for (; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) // curr is bigger swap
				{
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			i = 0; //reset i
			j--;  // reduce j ,   as last  arr[j] is largest,
		}
	}

	public static void main(String[] args) {
		int [] arr = new int [] {-1,40,5,1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
