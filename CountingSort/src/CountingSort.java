public class CountingSort {

    private int[] inputArray;
    private int inputArray_Size;
    private int[] indexArray;
    private int[] middleArray;

    public CountingSort(int[] inputArray) {
        this.inputArray = inputArray;
        this.inputArray_Size = inputArray.length;
        this.indexArray = new int[256];
        this.middleArray = new int[inputArray_Size];
        sortOperation();
    }

    public void sortOperation() {

        // initialize all the values inside the middleArray to be 0
        for (int i = 0; i < 256; i++) {
            indexArray[i] = 0;
        }

        for (int i = 0; i < inputArray_Size; i++) {
            indexArray[inputArray[i]]++;
        }

        for (int i = 1; i < 256; i++) {
            indexArray[i] += indexArray[i-1];
        }

        for (int i = 0; i < inputArray_Size; i++) {
            middleArray[indexArray[inputArray[i]] - 1] = inputArray[i];
            indexArray[inputArray[i]]--;
        }

        for (int i = 0; i < inputArray_Size; i++) {
            inputArray[i] = middleArray[i];
        }

    }

    public int[] getArr() {
        return inputArray;
    }
}
