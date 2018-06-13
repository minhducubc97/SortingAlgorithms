public class Main2 {
    public static void main(String[] args) {
        int[] inputArray = {0,1,2,6,9,11,15};
        Exercise2 ex = new Exercise2(inputArray);
        int smallestElement = ex.getResult();
        System.out.println(smallestElement);
    }
}