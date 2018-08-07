/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date : 23.03.2018
 * Description : Sorting and searching algorithms   
 */

package ssalgo;

import java.util.Arrays;
import java.util.Random;

public class QuickSortAlgo {
	public void quickSort(int[] dataset) {
		quickSort(dataset, 0, dataset.length-1);
	}
	
	private void quickSort(int[] dataset, int low, int high) {
		if (low < high+1) {
			int pivot = partition(dataset, low, high);
			//left-partition
			quickSort(dataset, low, pivot-1);
			//right-partition
			quickSort(dataset, pivot+1, high);
		}
	}
	
	// moves all n < pivot to left of pivot and all n > pivot 
	// to right of pivot, then returns pivot index.
	private int partition(int[] dataset, int low, int high) {
		//selects one pivot and swaps to bring it to the right
		swap(dataset, low, getPivot(low, high));
		int border = low + 1;
		for (int i = border; i <= high; i++) {
			if (dataset[i] < dataset[low]) {
				swap(dataset, i, border++);
			}
		}
		//swaps the pivot to its current location
		swap(dataset, low, border-1);
		return border-1;
	}

	private void swap(int[] dataset, int index1, int index2) {
		int temp = dataset[index1];
		dataset[index1] = dataset[index2];
		dataset[index2] = temp;		
	}
	
	// returns random pivot index between low and high inclusive.
	private int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high - low) + 1) + low;
	}
	
	public static void main(String[] args) {
		QuickSortAlgo qs = new QuickSortAlgo();
		int[] dataset = {9, 0, 1, 3, 4, 5, 2, 9, 8, 7, 6, 5, 9, 1, 0, 9};
		System.out.println(Arrays.toString(dataset));
		qs.quickSort(dataset);
		System.out.println(Arrays.toString(dataset));
	}
}
