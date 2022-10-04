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
public class hw7 {
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
        float ncv;
        float s;
        
        p = a + b + c;
        System.out.println("Chu vi tam giac: " + p);
        
        ncv = p / 2;
        s = (float) Math.sqrt(ncv * (ncv - a) * (ncv - b) * (ncv - c));
        System.out.println("Dien tich tam giac: " + s);
        
        
        
        
    }
}
