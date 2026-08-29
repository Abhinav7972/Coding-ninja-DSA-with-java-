//package java_basics.OOP_3.Interface;

public class Vehicle_use {

public static void main(String[] args) {
    Vehicle_interface vi; 
    
    Car c1 = new Car();

    vi = new Car();

    System.out.println(vi.Ismotorize());
    System.out.println(vi.getCompany());
    System.out.println(c1.numGears());
}
}
