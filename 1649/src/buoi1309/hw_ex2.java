

package buoi1309;

import java.util.Random;
import java.util.Scanner;

public class hw_ex2 {
    public static void main(String[] args) {
         /*bai2: Tìm dãy tăng liên tiếp dài nhát trong 1 mảng
              Ví dụ: arr = {3, 2, 1, 4, 5, 2, 4, 7, 9, 10, 2, 3}
              Output: 
              Dãy tăng liên tiếp dài nhất là: 2, 4, 7, 9, 10 */
    
        //C1: Khởi tạo tường minh các phần tử trong mảng
        int brr[] = {3, 2, 1, 4, 5, 2, 4, 7, 9, 10, 2, 3};
        //C2: dùng scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many elements in the array: ");
//        int n = scanner.nextInt();
//        int brr[] = new int[n];
        //c2: sinh ngẫu nhiên các phần tử của mảng
//        Random random = new Random();
//        for(int i=0; i<brr.length; i++){
//        brr[i] = scanner.nextInt();  //2.1: Nhập các phần tử cho mảng
//        brr[i] = random.nextInt();  //2.2: sinh ngẫy nhiên các phần tử
//            System.out.println(brr[i] + " ");
//        }
//        System.err.println();
        
        
        
        //----------------------------------------------
        //Process: tìm dãy con tăng liên tiếp dài nhất
        int max_size =1 , count = 1;
        int idx = 0;
        for(int i=0; i<brr.length-1; i++){
            //for vòng lặp để thực hiện khối lệnh được thực thi
        if(brr[i]<brr[i+1])
            count++;
        else{       //Gặp 1 số không tăng, dừng việc đếm, và xét các dk tương tự    
            if(count > max_size){
            max_size = count;
            idx = i - max_size + 1;
            }
            count = 1;
        }
      }
            System.out.println("Dãy liên tiếp tăng dài nhất là: ");
            for(int i=idx; i<idx+max_size; i++){
                System.out.println(brr[i] + " ");
            }
            System.out.println();
        }
    }
