/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession10;

import java.util.Scanner;

/**
 *
 * @author Admin
 */


public class hw10 {
   //thuộc tính:
int name;
String sex;
float birthday;
byte address;
    

//hàm k0 tham số
public hw10() {
        
    }
//hàm chứa tham số:

    public hw10(int name, String sex, float birthday, byte address) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
    }
    //hàm getter & setter:
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input name: ");
        name = input.nextInt();
        
        System.out.println("Input sex: ");
        sex = input.nextLine();
        
        System.out.println("Input birthday: ");
        birthday = input.nextFloat();
        
        System.out.println("Input address: ");
        address = input.nextByte();
       
    }
    

        
    
}
