//package java_basics.OOP_1.Employee_data;

public class Emp {
String name;
String city;
int emp_code;

Emp(String name, int emp_code)
{
this.name = name;
this.emp_code = emp_code;
}

Emp(String city)
{
 this.city = city;
}

public void print()
{
    System.out.println(name + " "+emp_code);
}
}
