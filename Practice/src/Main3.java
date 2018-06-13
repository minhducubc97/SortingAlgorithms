public class Main3 {

    public static void main(String[] args) {
        int[] inputArray = {0, 2, 1, 6, 8, 10};
        int[] inputArray2 = {5, 0 , 3, 5, 2};
        Exercise3 ex = new Exercise3(inputArray, inputArray2);
        int[] result = ex.getArr();
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
