public class Exercise1 {

    // PROBLEM: Sort a binary array so that all 0s go before 1s.

    public int[] sortBinary (int[] inputArray) {

        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
                countZero++;
            }
            else {
                countOne++;
            }
        }

        int outputSize = countZero + countOne;

        int[] result = new int[outputSize];
        for (int i = 0; i < outputSize; i++) {
            if (i < countZero) {
                result[i] = 0;
            }
            else {
                result[i] = 1;
            }
        }
        return result;
    }
}