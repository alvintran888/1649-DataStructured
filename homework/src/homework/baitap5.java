/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class baitap5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int thang, nam;
        do {
            System.out.print("Nhập vào một tháng bất kỳ: ");
            thang = sc.nextInt();
        } while (!(thang >= 1 && thang <= 12)); //trong khi tháng còn không nằm trong đoạn [1,12] thì còn yêu cầu nhập lại.
        switch (thang) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng %d có 30 ngày", thang);
                break;
            case 2:
                System.out.print("Nhập vào một năm: ");
                nam = sc.nextInt();
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) //nếu năm thỏa mãn một trong hai điều kiện đã phân tích ở trên
                {
                    System.out.printf("Tháng %d năm %d có 29 ngày", thang, nam); //thì tháng tương ứng có 29 ngày (năm nhuận)

                } else //nếu không thì
                {
                    System.out.printf("Tháng %d năm %d có 28 ngày", thang, nam); //tháng tương ứng có 29 ngày (năm thường)
                }
                break;
            default:
                System.out.printf("Tháng %d có 31 ngày", thang); //những tháng còn lại có 31 ngày
        }
    }

}
