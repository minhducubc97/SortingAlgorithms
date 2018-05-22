//Problem statement for MergeSort:
//MergeSort(arr[], l,  r)
//        If r > l
//        1. Find the middle point to divide the array into two halves:
//        middle m = (l+r)/2
//        2. Call mergeSort for first half:
//        Call mergeSort(arr, l, m)
//        3. Call mergeSort for second half:
//        Call mergeSort(arr, m+1, r)
//        4. Merge the two halves sorted in step 2 and 3:
//        Call merge(arr, l, m, r)

public class MergeSort {

    private int[] arr;

    public MergeSort(int[] arr, int l, int r) {
        this.arr = arr;
        mergeSortOperation(arr, l, r);
    }

    private void merge(int[] arr, int l, int m, int r) {
        int sizeLeftArray = m - l + 1;
        int sizeRightArray = r - m;
        int[] leftArray = new int[sizeLeftArray];
        int[] rightArray = new int[sizeRightArray];

        // copies values from the left half and right half into 2 separate arrays
        for (int i = 0; i < sizeLeftArray; i++) {
            leftArray[i] = arr[l + i];
        }
        for (int j = 0; j < sizeRightArray; j++) {
            rightArray[j] = arr[m + 1 + j];
        }

        // merge the array
        int i = 0; // starting index of the left array
        int j = 0; // starting index of the right array
        int k = l; // starting index of the original array

        while ((i < sizeLeftArray) && (j < sizeRightArray)) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }
            else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // when you already exhaust the right array before the left array
        while (i < sizeLeftArray) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        // when you already exhaust the left array before the right array
        while (j < sizeRightArray) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private void mergeSortOperation(int[] arr, int l, int r)
    {
        if (r > l) {
            int m = (l + r) / 2; // calculating middle index, m will be rounded down automatically
            mergeSortOperation(arr, l, m);
            mergeSortOperation(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    public int[] getArr() {
        return arr;
    }
}
