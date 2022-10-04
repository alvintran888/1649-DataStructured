/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession8;

/**
 *
 * @author Admin
 */

class Animal{
      //Các thuộc tính: Dùng biến đẻ thể hiện:
    private int id;
    String name;
    float age;
    byte gender;
    
    //Getter và Setter:
    //Getter: Truy cập gián tiếp vào member private để lấy thông tin.
    public int getId(){
        return id;
    }
    
    public byte getGender(){
        return gender;
    }
    
    //Setter: Truy cập gián tiếp vào member private để thiết lập thông tin.
    public void setId(int id){
        this.id = id;
    }
    
    public void setGender(byte gender){
        this.gender = gender;
    }
    
    //Hàm tạo không tham số:
    public Animal(){
        id = 12;
        name = "Moon";
        age = 1.5f;
        gender = 1;
    }
    //Hàm tạo đầy đủ tham số:

    public Animal(int id, String name, float age, byte gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    
    //Các phương thức: Dùng hàm để thể hiện
    void move(){
        System.out.println("Run, fly, Swim, ...");
    }
    
    void speak(){
        System.out.println("Gogo, meomeo, grm, ...");
    }
    
    void showInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " +name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

public class Lession8 {
  public static void main(String[] args) {
        //OOP:
        //Tạo đối tượng: 
        Animal cat = new Animal();
        //Truy cập các thành phần của đối tượng:
        //Sử dụng toán tử (.)
        cat.setId(13579); //set
        System.out.println("ID: " + cat.getId()); //get: lấy thông tin
        cat.move();
        //Hàm tạo (Constructor):
        // Dùng để khởi tạo giá trị cho các thuộc tính.
        cat.showInfo();
        
        Animal dog = new Animal(5678, "Vàng", 2, (byte)0);
        dog.showInfo();
        
        //Bổ từ truy cập
        //public: Member public có mức độ truy cập toàn project
        //private: có mức độ truy cập trong class chứa member private
        //protected: có mức độ truy cập trong package, trong đó chỉ những lớp kế thừa từ lớp khác mới truy cập được.
        //default: mức độ truy cập ở cấp package.
    }

}
