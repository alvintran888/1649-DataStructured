package buoi2209;

public class ex03 {

    public static void main(String[] args) {
        // Given an array 'arr', find the maximum value using recursive function
        int arr[] = {-5, -3, -9, -7, -5, -8, -4, -6};

        int max = Integer.MIN_VALUE;
        max = findMax(arr, 0, arr.length - 1, max);

        System.out.println("Maximum value is: " + max);
    }

    private static int findMax(int[] arr, int start, int end, int max) {
        if (start == end) {
            max = arr[end];
        } else {
            int a = findMax(arr, start, end - 1, max);
            max = (a > arr[end]) ? a : arr[end];
        }
        return max;
    }

}
