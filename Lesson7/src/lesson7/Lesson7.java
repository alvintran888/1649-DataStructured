/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

/**
 *
 * @author Admin
 */
public class Lesson7 {
    
    
    static void demo(){
        System.out.println("You are in demo() function");
    }
    
    
    static void tinhTong(float a, float b){
            System.out.format("%.2f + %.2f = %.2f", a, b, a + b);
    }
    
    double tinhBieuThucDelta(float a, float b, float c){
        double delta = b * b - 4 * a * c;
        return delta;
    }
    
    
    public static void main(String[] args) {
        //Function:
        Lesson7 lesson7 = new Lesson7();
        demo();
        tinhTong(10, 20); 
        System.out.println("\n" + lesson7.tinhBieuThucDelta(10, 30, 20));
    }
  
   
    
}
