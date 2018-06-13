public class Exercise1_Quicksort {

    // PROBLEM: Sort a binary array so that all 0s go before 1s.

    int[] inputArray;

    // Remember: For quicksort, all the elements with lower values are on the left
    // while elements with higher values are on the right
    public int[] sortBinary(int[] inputArray) {

        this.inputArray = inputArray;
        int startingIndex = 0;
        int pivot = 1;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < pivot) {
                swap(i, startingIndex);
                startingIndex++;
            }
        }
        return inputArray;
    }

    public void swap(int i, int j)
    {
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}