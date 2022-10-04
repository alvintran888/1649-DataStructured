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

class Dongvat{
    int id;
    String name;
    float age;
    byte gender;
    
    public void move(){
        System.out.println("Run, swim, fly, ...");
    }
    
    public void speak(){
        System.out.println("Gogo, meomeo, grum, ...");
    }
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input id: ");
        id = input.nextInt();
        System.out.println("Input name: ");
        name = input.nextLine();
        System.out.println("Input age: ");
        age = input.nextFloat();
        System.out.println("Input gender: ");
        gender = input.nextByte();
    }

    public Dongvat(int id, String name, float age, byte gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Dongvat() {
    }  
}
class Cat extends Dongvat{
    String color;
    public Cat() {
    }
    
    public Cat(int id, String name, float age, byte gender) {
        super(id, name, age, gender);
    }

    public Cat(String color, int id, String name, float age, byte gender) {
        super(id, name, age, gender);
        this.color = color;
    }
    
// @Override
    public void inputInfor(){
    Scanner input = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Input color: ");
        input.nextLine();
        color = input.nextLine();
    }
    
@Override
public void move(){
    System.out.println("Run, walk");
}
public void speak(){
    System.out.println("Meomeo");
        }
}

public class Lession10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Thừa kế:Dùng từ khoá extends để thể hiện
        //kỹ thuật thừa kế
        Cat cat = new Cat();
        cat.move();
        }
    }
    

