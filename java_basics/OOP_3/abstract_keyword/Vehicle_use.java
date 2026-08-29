//package java_basics.OOP_3.abstract_keyword;

public class Vehicle_use {
    public static void main(String[] args) {
        Company c1 = new Company("BMW");
        String company1 = c1.getCompany();

        System.out.println(company1);
        System.out.println(c1.isMotorized());
    }
}
