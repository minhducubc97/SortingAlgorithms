public class BubbleSort {

    // Solution:
    // We travel through the array thoroughly every cycle.
    // If the two consecutive elements are in reverse order,
    // we swap them. We continue do them until no more swaps
    // occur, which is when we obtain a sorted list

    int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
        sortOperation();
    }

    public void sortOperation() {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                flag = true;
            }
        }
        if (flag) {
            sortOperation();
        }
    }

    public int[] getArr() {
        return arr;
    }

}
