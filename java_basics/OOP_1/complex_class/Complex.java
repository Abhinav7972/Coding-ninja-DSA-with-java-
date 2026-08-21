
public class Complex {
 int real_number;
 int imaginary_number; 

public Complex(int real_number, int imaginary_number)
{
this.real_number = real_number;
this.imaginary_number = imaginary_number; 
}

public void setReal(int real_number)
{
this.real_number = real_number;
}

public void setImaginary(int imaginary_number)
{
    this.imaginary_number = imaginary_number;
} 

public void print()
{
  System.out.println(real_number + "+" + imaginary_number + "i") ;
}

public void add(Complex c)
{
 this.real_number = this.real_number + c.real_number;
 this.imaginary_number = this.imaginary_number + c.imaginary_number;
}

public void multiply(Complex c)
{
 int newReal = (this.real_number*c.real_number) - (this.imaginary_number*c.imaginary_number);
 int newImg = (this.real_number*c.imaginary_number)+(this.imaginary_number*c.real_number);
 this.real_number = newReal;
 this.imaginary_number = newImg;
}

}