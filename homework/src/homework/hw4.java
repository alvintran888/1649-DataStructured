/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;
/**
 *
 
 */
public class hw4 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, c;
        System.out.print("Input n: ");
        n = input.nextInt();
        while(n != 0)
        {   
            c = n % 10;
            n = n / 10;
            System.out.println(c);
        }
    }
}
