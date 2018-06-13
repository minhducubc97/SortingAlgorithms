public class Exercise3 {

    // PROBLEM: Merge 2 unsorted arrays that have empty elements into a single sorted array

    int[] x;
    int[] y;
    int[] finalResult;

    public Exercise3(int[] x, int[] y) {

        this.x = x;
        this.y = y;
        int nonEmpty_1 = 0;
        int nonEmpty_2 = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] != 0) {
                x[nonEmpty_1] = x[i];
                nonEmpty_1++;
            }
        }

        for (int j = 0; j < y.length; j++) {
            if (y[j] != 0) {
                y[nonEmpty_2] = y[j];
                nonEmpty_2++;
            }
        }
        x = subSort(x, nonEmpty_1);
        y = subSort(y, nonEmpty_2);

        // merge the two array together
        sortOperation(x, y, x.length, y.length);
    }

    // remove the empty element and sort the array
    public int[] subSort(int[] inputArray, int effSize) {
        // sort each input array
        int[] nonEmptyArray = new int[effSize];
        for (int i = 0; i < effSize; i++) {
            nonEmptyArray[i] = inputArray[i];
        }
        InsertionSort(nonEmptyArray);
        return nonEmptyArray;
    }

    public void InsertionSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            int minIndex = i;
            int min = arrayToSort[i];
            for (int j = i; j < arrayToSort.length; j++) {
                if (min > arrayToSort[j]) {
                    min = arrayToSort[j];
                    minIndex = j;
                }
            }

            int temp = arrayToSort[minIndex];
            arrayToSort[minIndex] = arrayToSort[i];
            arrayToSort[i] = temp;
        }
    }

    public void sortOperation(int[] x, int[] y, int size1, int size2) {
        int totalSize = size1 + size2;
        int[] result = new int[totalSize];
        int lastIndexResult = totalSize - 1;
        int lastIndexX = size1 - 1;
        int lastIndexY = size2 - 1;
        while ((lastIndexX >= 0) && (lastIndexY >= 0)) {
            if (x[lastIndexX] > y[lastIndexY]) {
                result[lastIndexResult] = x[lastIndexX];
                lastIndexResult--;
                lastIndexX--;
            }
            else {
                result[lastIndexResult] = y[lastIndexY];
                lastIndexResult--;
                lastIndexY--;
            }
        }
        if (lastIndexX >= 0) {
            for (int i = lastIndexX; i >= 0; i--) {
                result[i] = x[i];
            }
        }
        else if (lastIndexY >= 0) {
            for (int i = lastIndexY; i >= 0; i--) {
                result[i] = y[i];
            }
        }
        this.finalResult = result;
    }

    public int[] getArr() {
        return finalResult;
    }
}
