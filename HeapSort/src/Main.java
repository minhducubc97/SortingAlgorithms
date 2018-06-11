public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] input_arr = {3,5,1,5,2,8,24,6,3}; // input array
        int[] result;
        HeapSort ms = new HeapSort(input_arr);
        result = ms.getArr();

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}