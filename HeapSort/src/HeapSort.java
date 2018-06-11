public class HeapSort {

    private int[] arr;

    public HeapSort(int[] arr) {
        this.arr = arr;
        sort();
    }

    public void makeMaxHeap(int size, int chosenIndex) {
        int largestIndex = chosenIndex; // first, initialize the largest index as the chosenIndex
        int left = 2 * chosenIndex + 1; // left child node
        int right = 2 * chosenIndex + 2; // right child node

        // if right child node has bigger value than the largest index => start swapping process
        if ((right < size) && (arr[right] > arr[largestIndex])) {
            largestIndex = right;
        }
        // if left child node has bigger value than the largest index => start swapping process
        if ((left < size) && (arr[left] > arr[largestIndex])) {
            largestIndex = left;
        }

        if (largestIndex != chosenIndex) {
            int temp = arr[chosenIndex];
            arr[chosenIndex] = arr[largestIndex];
            arr[largestIndex] = temp;

            // carries on recursively to the sub-tree
            makeMaxHeap(size, largestIndex);
        }
    }

    public void sort() {
        int size = arr.length;

        // create the heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            makeMaxHeap(size, i);
        }

        // perform swap and heapify
        for (int i = size - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            makeMaxHeap(i,0);
        }

    }

    public int[] getArr() {
        return arr;
    }

}
