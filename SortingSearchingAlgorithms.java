/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date : 23.03.2018
 * Description : Sorting and searching algorithms   
 */

package ssalgo;
import java.util.Random;

class SSAlgorithms {
	int size;

	SSAlgorithms(int size) {
		this.size = size;
		int[] data_set = new int[size];
		
		Random gnrNumber= new Random();
		for(int count=0; count<size; count++){
			data_set[count] = gnrNumber.nextInt(100); 
		}
		
		System.out.println("=== Generated Unsorted Array ===");
		//showInfo(data_set);
		//BubbleSort(data_set);
		//InsertionSort(data_set);
		//QuickSort(0, data_set.length, data_set);
	}

	public void showInfo(int[] data_set) {
		for(int count=0; count<data_set.length; count++){
			System.out.print(data_set[count]+" , ");
		}
		System.out.println();
	}

	public void BubbleSort(int[] data_array) {
		boolean check;
		for (int row=0; row<=data_array.length-1; row++) {
			check=false;
			
			for (int col=0; col<data_array.length-1; col++) {
				if (data_array[col] > data_array[col+1]) {
					int temp = data_array[col];
					data_array[col] = data_array[col+1];
					data_array[col+1] = temp;
					check=true;
				}
			}
			//checks whether there is a sorting occuring
			if(!check)
				break;
		}
		System.out.println("=== Sorted Array by Using BubbleSort ===");
		showInfo(data_array);
		
	} // end of bubblesort
	
	public void InsertionSort(int[] data_array){
		for (int idx=1; idx<data_array.length; idx++) {
		      int elmcmp = data_array[idx]; 
		      int idx_sorted = idx;
		      
		      //controls the sorted array
		      while (idx_sorted>0 && data_array[idx_sorted-1]>elmcmp) {
		    	  data_array[idx_sorted] = data_array[idx_sorted-1];
		    	  idx_sorted--;
		      }
		      //last current position of sorted index
		      data_array[idx_sorted] = elmcmp;
		}
		
		System.out.println("=== Sorted Array by Using InsertionSort ===");
		showInfo(data_array);
	} //end of insertion sort
	
	public void QuickSort(int lowerIndex, int higherIndex, int[] data_array) {
        
        int lw_idx = lowerIndex;
        int hg_idx = higherIndex;
        
        // calculate pivot number, the pivot taken as a middle index number
        int pivot = data_array[lowerIndex+(higherIndex-lowerIndex)/2];
        
        // Divide into two arrays
        while (lw_idx <= hg_idx) {
            /**
             * In each iteration, the algorithm identifies a number from left side which 
             * is greater then the pivot value, and also identifies a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then both numbers are exchanged.
             */
            while (data_array[lw_idx] < pivot) {
            	lw_idx++;
            }
            while (data_array[hg_idx] > pivot) {
            	hg_idx--;
            }
            
            if (lw_idx <= hg_idx) {
                swapNumbers(lw_idx, hg_idx, data_array);
                //move index to next position on both sides
                lw_idx++;
                hg_idx--;
            }
        }
        
        // call quickSort() method recursively
        if (lowerIndex < hg_idx)
            QuickSort(lowerIndex, hg_idx, data_array);
        if (lw_idx < higherIndex)
            QuickSort(lw_idx, higherIndex, data_array);
    }
 
    private void swapNumbers(int lw_idx, int hg_idx, int[] data_array) {
        int temp = data_array[lw_idx];
        data_array[lw_idx] = data_array[hg_idx];
        data_array[hg_idx] = temp;
    }
}

public class SortingSearchingAlgorithms {

	public static void main(String[] args) {
		SSAlgorithms saTest = new SSAlgorithms(10);
		
		int[] data_array = {2,-3,4,10,5,8,-2}; 
		
		for(int count=0; count<data_array.length; count++){
			System.out.print(data_array[count]+" , ");
		}
		System.out.println();
		
		int lowerIndex = 0;
		int higherIndex = data_array.length;
		saTest.QuickSort(lowerIndex, higherIndex-1, data_array);
		
		System.out.println("=== Sorted Array by Using QuickSort ===");
		for(int count=0; count<data_array.length; count++){
			System.out.print(data_array[count]+" , ");
		}
		System.out.println();
	}

}
