/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author Admin
 */
public class Student {
         
static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void remove(int removeIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    int id;
    String name;
    byte gender;
    byte age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte getGender() {
        return gender;
    }

    public byte getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
