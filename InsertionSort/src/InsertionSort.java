public class InsertionSort {

    // Solution:
    // Starting index at first is 0. We then locate the min of the array starting
    // from the starting index and put it at the front of the array. We then locate
    // the min of the same array but starting index at 1, and put it at the second
    // index of the array. We continue the process, with the starting index increasing
    // each time until the starting index is equal to the ending index. At that point
    // we have a sorted array.

    private int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
        sortOperation(arr);
    }

    public void sortOperation (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public int[] getArr() {
        return arr;
    }
}
