/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

import java.util.Scanner;
import static lesson7.Lesson7.demo;

/**
 *
 * @author Admin
 */
//1. Khai bão 2 bièn static float number1, number2
public class baitapvidu {
      private static Scanner scanner = new Scanner(System.in);
    
//    static void demo(){
//        System.out.println("You are in demo() function");
//    }
    //2. Dinh nghia hàm có tên nhapLieu() để nhập liệu cho 2 biến number1, number2
   static void nhapLieu(float a, float b){
       System.out.format("%.2f, %.2f \n", a, b);
   }
    
    //3. Dinh nghĩa hàm có tên tinhTong() để tinh tổng cua 2 só number1, number2
    static void tinhTong(float a, float b){
            System.out.format("%.2f + %.2f = %.2f\n", a, b, a + b);
    }
        //4. Dinh nghia hàm có tên tinhHieu() để tinh tổng cua 2 só number1, number2
    static void tinhHieu(float a, float b){
        System.out.format("%.2f - %.2f = %.2f\n", a, b, a - b);
    
    }
    //5. Dinh nghia hàm có tên tinhNhan() để tinh tổng cua 2 só number1, number2
    static void tinhNhan(float a, float b){
        System.out.format("%.2f * %.2f = %.2f\n", a, b, a * b);
    }
    //6. Dinh nghia hàm có tên tinhChia() để tinh tổng của 2 só number1, number2
    static void tinhChia(float a, float b){
        System.out.format("%.2f / %.2f = %.2f\n", a, b, a / b);
    }
    
     
    
    public static void main(String[] args) {
        //Function:
        Lesson7 baitapvidu = new Lesson7();
     //        demo();    
         nhapLieu(7, 8);

         tinhTong(10, 10);
         tinhHieu(30, 10);
         tinhNhan(7, 3);
         tinhChia(13, 3);
                System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BSCNN(a, b));
    }
    
    
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    
    
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
    
    
}
