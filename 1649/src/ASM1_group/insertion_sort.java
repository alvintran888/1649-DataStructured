package ASM1_group;


public class insertion_sort {
    static void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
  
           // hàm sắp xếp mảng bằng cách sắp xếp chèn
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
  
    // hàm để in mảng có kích thước n phần tử
    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.print("\n");
    }
  
  //main chạy 
    public static void main(String[] args)
    {
        int[] arr = { 12, 66, 11, 13, 5, 6,34,11,3,2,4,322,2,33 };
        sort(arr);
        printArray(arr);
    }
}




           


/*    
                64     25     12     22     11

th1:            
th2:            
th3:            
th4:            
th5:            
th6:            
th7:            
th8:            
*/