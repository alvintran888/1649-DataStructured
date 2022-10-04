/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession14;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lession14 {

    static int inputN() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Input N:");
        int N;
        N = Integer.parseInt(input.nextLine());
        if (N < 0) {
            N = 0;
            throw new Exception();
        }
        return N;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws Exception {

        int N = 0;
        while (true) {
            try {
                N = inputN();
                break;

            } catch (ArithmeticException ae) {
                System.out.println("Wrong data type!");
            } catch (NumberFormatException nfe) {
                System.out.println("Wrong data type!");
            } catch (Exception e) {
                System.out.println("Negative number!");
            } finally {
                System.out.println("Finally!");
            }
            System.out.println("N = " + N);
            //Sử dụng try-catch-finally để xử lý ngoại lệ.

        }
    }

}
