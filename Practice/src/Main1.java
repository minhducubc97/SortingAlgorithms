public class Main1 {

    public static void main(String[] args) {
        int[] inputArray = {0,1,0,1,0,0,1,1};

        Exercise1 ex = new Exercise1();
        int[] result = ex.sortBinary(inputArray);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println("");

        Exercise1_Quicksort ex2 = new Exercise1_Quicksort();
        int[] result2 = ex2.sortBinary(inputArray);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
