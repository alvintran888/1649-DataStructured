package buoi2209;

public class ex03_giaidequy_max {

    public static void main(String[] args) {
        // Given an array 'arr', find the maximum value using recursive function
        int arr[] = {5, -3, -9, -7, -5, 8, -4, -6};

        int idx = 0;
        int result[] = findMax(arr, 0, arr.length - 1, idx);

        System.out.println("Maximum value is: " + arr[result[0]] + ", at position " + idx);
        
    }

    private static int[] findMax(int[] arr, int start, int end, int idx) {
        if (start == end) {
            idx = end;
        } else {
            int a[] = findMax(arr, start, end - 1, idx);
            idx = (arr[a[0]] > arr[end]) ? a[0] : end;
            
        }
        return new int[] {idx};
    }
}
