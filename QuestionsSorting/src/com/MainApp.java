package com;

import java.util.Arrays;

public class MainApp {

	// Bubble Sort Method for Descending Order
	public static void BubbleSort(int[] num) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) // change to > for ascending sort
				{
					temp = num[j]; // swap elements
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}
	}

	// Insertion Sort Method for Descending Order
	public static void InsertionSort(int[] num) {
		int j; // the number of items sorted so far
		int key; // the item to be inserted
		int i;

		for (j = 1; j < num.length; j++) // Start with 1 (not 0)
		{
			key = num[j];
			for (i = j - 1; (i >= 0) && (num[i] < key); i--) // Smaller values
																// are moving up
			{
				num[i + 1] = num[i];
			}
			num[i + 1] = key; // Put the key in its proper location
		}
	}

	// Selection Sort Method for Descending Order
	public static void SelectionSort(int[] num) {
		int i, j, first, temp;
		for (i = num.length - 1; i > 0; i--) {
			first = 0; // initialize to subscript of first element
			for (j = 1; j <= i; j++) // locate smallest element between
										// positions 1 and i.
			{
				if (num[j] < num[first])
					first = j;
			}
			temp = num[first]; // swap smallest found with element in position
								// i.
			num[first] = num[i];
			num[i] = temp;
		}
	}

	// Merge Sort Method for Ascending Order
	public static class MergerSort {
		public static void main(String[] args) {
			// Unsorted array
			Integer[] a = { 2, 6, 3, 5, 1 };

			// Call merge sort
			mergeSort(a);

			// Check the output which is sorted array
			System.out.println(Arrays.toString(a));
		}

		@SuppressWarnings("rawtypes")
		public static Comparable[] mergeSort(Comparable[] list) {
			// If list is empty; no need to do anything
			if (list.length <= 1) {
				return list;
			}

			// Split the array in half in two parts
			Comparable[] first = new Comparable[list.length / 2];
			Comparable[] second = new Comparable[list.length - first.length];
			System.arraycopy(list, 0, first, 0, first.length);
			System.arraycopy(list, first.length, second, 0, second.length);

			// Sort each half recursively
			mergeSort(first);
			mergeSort(second);

			// Merge both halves together, overwriting to original array
			merge(first, second, list);

			return list;
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
			// Index Position in first array - starting with first element
			int iFirst = 0;

			// Index Position in second array - starting with first element
			int iSecond = 0;

			// Index Position in merged array - starting with first position
			int iMerged = 0;

			// Compare elements at iFirst and iSecond,
			// and move smaller element at iMerged
			while (iFirst < first.length && iSecond < second.length) {
				if (first[iFirst].compareTo(second[iSecond]) < 0) {
					result[iMerged] = first[iFirst];
					iFirst++;
				} else {
					result[iMerged] = second[iSecond];
					iSecond++;
				}
				iMerged++;
			}
			// copy remaining elements from both halves - each half will have
			// already sorted elements
			System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
			System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
		}
	}

	/**
	 * Shellsort, using a sequence suggested by Gonnet.
	 * @param a an array of Comparable items.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void shellsort(Comparable[] a) {
		for (int gap = a.length / 2; gap > 0; gap = gap == 2 ? 1 : (int) (gap / 2.2)) {
			for (int i = gap; i < a.length; i++) {
				Comparable tmp = a[i];
				int j = i;
				for (; j >= gap && tmp.compareTo(a[j - gap]) < 0; j -= gap) {
					a[j] = a[j - gap];
				}
				a[j] = tmp;
			}
		}
	}
}