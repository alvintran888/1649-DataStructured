/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession19;

import java.util.stream.DoubleStream;

/**
 *
 * @author Admin
 */
public class Lession19 {

    static void tinhTong(double...d){
        System.out.println("Tổng = " + DoubleStream.of(d).sum());
    }

    static void tinhTrungBinhCong(double...d){
        System.out.println("Trung bình cộng: " + DoubleStream.of(d).average());
    }
    
    public static void main(String[] args) {
       tinhTong(1, 2, 3, 4, 6);
       tinhTrungBinhCong(2, 3, 4, 5);
    }
    
}
