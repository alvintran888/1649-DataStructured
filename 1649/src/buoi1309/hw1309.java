package buoi1309;

import java.util.HashMap;
import java.util.Scanner;

public class hw1309 {

    /*bai1 :1. cho tổng 1 mảng arr và 1 giá trị k, tìm các cặp có tổng bằng k 
                Ví dụ: ar = {1, 9, 2, 8, 2, 7, 0, 4, 1, 6}
              k = 10
              output: (1,9); (2,8), (4,6)*/
    public static void main(String[] args) {
        int[] a = {1, 9, 2, 8, 2, 7, 0, 4, 1, 6};
        printSumPairs(a, 10);
    }

    public static void printSumPairs(int[] input, int k) {
        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
//k: đây là kiểu key để lưu trữ.
//V: đây là kiểu giá trị được ánh xạ.
//HashMap không thể chứa các key trùng lặp.
//Nó chứa các key duy nhất.
//Nó có thể có 1 key là null và nhiều giá trị null.
//Nó duy trì các phần tử KHÔNG theo thứ tự.
        for (int i = 0; i < input.length; i++) {

            if (pairs.containsKey(input[i])) //HashMap containsKey() dùng để kiểm tra một Key có tồn tại trong HashMap hay không
            {
                System.out.println("(" + input[i] + ", " + pairs.get(input[i]) + ")");
            } else {
                pairs.put(k - input[i], input[i]);
            }
        }
    }
}

//        //C2: Khai báo 1 mảng
//        int a;
//        int brr[]; //Declaration
//        
//        a = 5;
//        brr = new int[10]; // Initialize dèault values
//        //10: length of the array 'brr' - Số phần tử mảng có thể lưu trữ
//       
//        //Unknow: số phaanf tử hiện thời đang dùng trong mảng
//        
//        
//        System.out.println("a");
//        System.out.println("brr[10]");
//        System.out.println("Length of brr = " + brr.length);
//        System.out.println("Length of arr = " + arr.length);

