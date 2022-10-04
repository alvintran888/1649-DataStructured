package ASM1_group;

public class selection_sort {

    static void sort(int[] arr) {
        int n = arr.length;

        // di chuyển các giá trị trong mảng
        for (int i = 0; i < n - 1; i++) {
            // Tìm giá trị bé nhất trong mảng
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            /*đổi vị trí cho phần tử bé nhất trong mảng lên đầu tiên*/
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // In ra mảng
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // hàm dùng để in ra mảng và nhập vào mảng arr
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 5, 7, 9};
        sort(arr);
        System.out.println("Sap xep thu tu gia tri cua Nghia la: ");
        printArray(arr);
    }

}