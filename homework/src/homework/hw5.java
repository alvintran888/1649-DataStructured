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
public class hw5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double gradefirst;
        System.out.print("Input Grade first: ");
        gradefirst = input.nextDouble();
        System.out.println("Grade First: " + gradefirst);
        
        double gradeonline;
        System.out.print("Input Grade Online: ");
        gradeonline = input.nextDouble();
        System.out.println("Grade Online: " + gradeonline);
        
        double gradefinal;
        System.out.print("Input Grade Final: ");
        gradefinal = input.nextDouble();
        System.out.println("Grade Final: " + gradefinal);
        
        double total;
        total = (gradefirst * 0.25) + (gradeonline * 0.25) + (gradefinal * 0.5);
        System.out.println("Total: " + total);
    }
}
