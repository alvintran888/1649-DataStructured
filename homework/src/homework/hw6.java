/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class hw6 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;        
        int c;
        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();
        System.out.print("c: ");
        c = input.nextInt();
        float p;
        float s;
        
        p = a + b + c;
        System.out.println("Chu vi tam giac vuong: " + p);

        s = (a * b) / 2;
        System.out.println("Dien tich tam giac vuong: " + s);
    }
}
