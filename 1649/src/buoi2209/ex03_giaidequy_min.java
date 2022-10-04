package buoi2209;

public class ex03_giaidequy_min {

       public static void main(String[] args) {
        // Given an array 'arr', find the idximum value using recursive function
        int arr[] = {5, 3, 9, 7, 15, 8, 4, 6};
        int idx = 0;
        int idx_min = 0;
        int result[] = findMaxMin(arr, 0, arr.length - 1, idx, idx_min);

        System.out.println("Minumun value is: " + arr[result[1]] + ", at position " + result[1]);
        System.out.println("Maximum value is: " + arr[result[0]] + ", at position " + result[0]);
    }

    private static int[] findMaxMin(int[] arr, int start, int end, int idx, int idx_min) {

        if (start == end) {
            idx = end;
        } else {
            int a[] = findMaxMin(arr, start, end - 1, idx, idx_min);
            idx = (arr[a[0]] > arr[end]) ? a[0] : end;
            idx_min = (arr[a[1]] < arr[end]) ? a[1] : end;
        }
        return new int[]{idx, idx_min};
    }
}
