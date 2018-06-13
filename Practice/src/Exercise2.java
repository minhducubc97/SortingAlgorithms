public class Exercise2 {

    // PROBLEM: Find the smallest missing element from a sorted array,
    // given time complexity equal O(log(n))

    int[] inputArray;
    int result;

    public Exercise2(int[] inputArray) {
        this.inputArray = inputArray;
        sortOperation(inputArray, 0,inputArray.length - 1);
    }

    public void sortOperation (int[] inputArray, int startingIndex, int endingIndex) {

        // base case
        if (startingIndex > endingIndex) {
            result = startingIndex;
        }
        else {
            int mid = startingIndex + (endingIndex - startingIndex) / 2;
            if (inputArray[mid] != mid) {
                sortOperation(inputArray, startingIndex, mid - 1);
            }
            else {
                sortOperation(inputArray, mid + 1, endingIndex);
            }
        }
    }

    public int getResult() {
        return result;
    }
}
