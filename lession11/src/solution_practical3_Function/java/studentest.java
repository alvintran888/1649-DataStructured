/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution_practical3_Function.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class studentest {
    Scanner
    static int N;
    static Student[] student;
    
    public static void menu() {
        System.out.println("1. Input students");
        System.out.println("2, Show all students");
        System.out.println("3. Show students ưith highest"
                + " and lowest average mark");
        System.out.println("4. Find student by ID");
        System.out.println("5. Show all student by Name");
        System.out.println("6. Show all student have scholarship" + " and short by descending");
        System.out.println("7. Exit");       
    }
    
    public static void main(String[] args) {
        
    }
    public static void inputNStudent() {
        do{
            System.out.println("Input N: ");
            N = Integer.parseInt(input.nextLine());
            
        }
        int option;
        menu();
        while(true){
            System.out.println("Please select an option: ");
            option = Intege.parseInt(input.nextLine());
            switch(option)
        }
    }
    
}
