
public class fraction {
  int numerator;
  int denominator;

  public fraction(int numerator, int denominator)
  {
    if(denominator==0)
    {
        denominator=1;
    }
    this.numerator = numerator;
    this.denominator = denominator;
    simplify();
  } 

  public void print()
  {
    System.out.println(numerator + "/" + denominator);
  }  


  private void simplify()
  {

    int gcd =1;
    int smaller = Math.min(numerator,denominator);

    for(int i=1;i<=smaller;i++)
    {
      if(numerator%i==0 && denominator%i==0)
      {
        gcd=i;
      }
    }

    numerator = numerator/gcd;
    denominator = denominator/gcd;
  }

  public void increament()
  {
    numerator = numerator + denominator; 
    simplify();
  } 

  public void setNumerator(int numerator)
  {
    this.numerator = numerator;
    simplify();
  }

  public void setDenominator(int denominator)
  {
    if(denominator==0)
    {
        return;
    }
    this.denominator=denominator;
    simplify();
  } 

  public void add(fraction f2)
  {
    this.numerator = this.numerator*f2.denominator+ this.denominator*f2.numerator;
    this.denominator = this.numerator * f2.denominator;
    simplify();
  }
 

public static fraction add(fraction f1, fraction f2)
{
int num = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
int denom = f2.denominator * f1.denominator;

fraction f3 =  new fraction(num, denom);
return f3;
}

}
