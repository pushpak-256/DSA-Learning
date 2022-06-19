package Sorting;

import java.util.Arrays;

/**
 * TC - O(n^2) - Quadratic SP - O(1) - Constant Unstable
 * 
 * Find Largest element, for each iteration, & swap it with last index of
 * unsorted part of Array
 * 
 * @author Pushpak Bhagat
 *
 */
public class SelectionSort {

	public static void selectionSort(int[] arr) {
		int i = 0, lastIndex = arr.length - 1; // of unsorted part of Array
		while (i <= lastIndex) {
			int maxIndex = i;
			for (; i <= lastIndex; i++) {
				if (arr[maxIndex] < arr[i]) {
					maxIndex = i;
				}
			}
			swap(maxIndex, lastIndex, arr);
			i = 0;
			lastIndex--;
		}
	}

	public static void swap(int maxIndex, int lastIndex, int[] arr) {
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[lastIndex];
		arr[lastIndex] = temp;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 1, 3, 9, 7 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
