public class QuickSort {

    // Solution:
    // - Use the divide and conquer algorithm (recursive) to break
    // down the input list
    // - Every cycle, pick an element as a pivot (I chose the
    // left-most element)
    // - Do swapping for the rest of the list so that the left hand
    // side of the pivot has smaller/equal values to the pivot, while
    // the right hand side has the greater values. After that, insert
    // the pivot into the correct position.

    int[] arr;
    int starting_index;
    int ending_index;

    public QuickSort (int[] arr, int starting_index, int ending_index) {
        this.arr = arr;
        this.starting_index = starting_index;
        this.ending_index = ending_index;
        sortOperation(arr, starting_index, ending_index);
    }

    private void sortOperation(int[] arr, int starting_index, int ending_index) {
        int partitioning_index;
        if (starting_index < ending_index) {
            partitioning_index = partition(arr, starting_index, ending_index);
            sortOperation(arr, starting_index, partitioning_index - 1);
            sortOperation(arr, partitioning_index + 1, ending_index);
        }
    }

    private int partition (int[] arr, int low, int high) {
        // choose pivot to be the element at the left-most position
        int pivot = arr[low];
        int j = low + 1;
        for (int i = low + 1; i <= high; i++) {
            if (pivot >= arr[i]) {
                swapIndex(j, i);
                j++;
            }
        }
        swapIndex(low, j - 1);
        return j - 1;
    }

    private void swapIndex (int swapIndex1, int swapIndex2) {
        int temp = arr[swapIndex1];
        arr[swapIndex1] = arr[swapIndex2];
        arr[swapIndex2] = temp;
    }

    public int[] getArr() {
        return arr;
    }
}
