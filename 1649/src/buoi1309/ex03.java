
package buoi1309;

import java.util.Scanner;

public class ex03 {
    //In ra bảng cửu chương
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        //Scanner dùng để lấy những câu lệnh nhập dữ liệu từ người dùng
        
        System.out.println("Enter N : ");
        int n = sc.nextInt();// số ô cửu chương ta cần in
        for (int i = 1; i <= n; i++) { //xét lần lượt từng ô cửu chương
        for (int j = 1; j <= 30; j++) { // Các giá trị cần nhân trong ô cửu chương đang xét
        //for vòng lặp để thực hiện khối lệnh được thực thi
        
        int results = j * i;
            System.out.println(i + " x " + j + " = " + results);
        } 
            System.out.println("---------------------");
        }
    }
}
