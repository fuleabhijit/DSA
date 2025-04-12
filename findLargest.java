public class Main {
    public static int findLargest(int[] arr) {
        int max = arr[0]; // Assume first element is max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 3};
        System.out.println("Largest element is: " + findLargest(arr)); // Output: 20
    }
}
