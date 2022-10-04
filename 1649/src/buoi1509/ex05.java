package buoi1509;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        //Nhận vào 1 chuỗi, và 1 số k biểu diễn k phép dịch phải ký tự
        //In ra chuỗi kết quả

        //Ví dụ: str = "Quay", k=2
        //         output = "Swcb"
        String str = "Quay";
        int k = 3;
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int t = ch[i] + k%26;
            if (isLower(ch[i])) {
                ch[i] = (char) ((t <= 'z') ? t : ('a' + (t - 'z')));
                //
            } else {
                ch[i] = (char) ((t <= 'Z') ? t : ('A' + t - 'Z'));
            }
//            ch[i] = (char) (ch[i] + k);
        }
        String output = new String(ch);
        System.out.println("Result = " + output);
    }
    // thành phần trong hàm:
    // 1.Tham số( parameter) là input của 1 hàm
    // 2.Kiểu dữ liệu của giá trị trả về
    //data type of the expected output
    //3. Function name VD: Islower
    private static boolean isLower(char c) { //Phân biệt chữ hoa và chữ thường
        if (c >= 'a' && c <= 'z') {
            return true; // giá trị được rả về (returned value)
        } else {
            return false;
        }
//        Scanner scan = new Scanner (System. in) ;
//        String input = scan. nextLine();
//        int k = scan.nextInt () ;
//        char[] chars = input.toCharArray () ;
//        for (int i = 0; 1 < chars.length; i++){
//            chars[i] += k;
//    }
//        for (int i = 0; i < chars.length; i++)
//        System.out.print (chars[i]);
    }

}
