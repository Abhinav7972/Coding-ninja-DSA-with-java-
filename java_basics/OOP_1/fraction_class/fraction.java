
public class fraction {
  int numerator;
  int denominator;

  public fraction(int numerator, int denominator)
  {
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
  }

  public void setDenominator(int denominator)
  {
    this.denominator=denominator;
  }
 


}
