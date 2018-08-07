/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date : 23.03.2018
 * Description : Sorting and searching algorithms   
 */

package ssalgo;

public class BinarySearchAlgo {
	 
    public int binarySearch(int[] inputDataset, int value) {
         
        int low = 0;
        int high = inputDataset.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (value == inputDataset[mid]) {
                return mid;
            }
            else if (value < inputDataset[mid]) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
        BinarySearchAlgo binsrch = new BinarySearchAlgo();
        //For binary search make sure that array is sorted
        int[] dataset = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Number 6 is at position :"+binsrch.binarySearch(dataset, 12));
    }
}
