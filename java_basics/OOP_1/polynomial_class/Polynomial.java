
public class Polynomial {
  int coffdegree [];

  public Polynomial ()
  {
     coffdegree = new int[10];
  } 

  public void setCoefficient(int degree,int coefficient)
  {
      if(degree>=coffdegree.length)
      {
        int newArr [] = new int[degree+1];

        for(int i=0;i<coffdegree.length;i++)
        {
            newArr[i] = coffdegree[i];
        }
        coffdegree = newArr;
      }

      coffdegree[degree] = coefficient;
  } 

  public int getCoefficient(int degree) 
  {
     if(degree < 0 || degree >= coffdegree.length) {
        return 0;
    }
     return coffdegree[degree];
  }

  public void add(Polynomial p1)
  {
    int maxLength = Math.max(this.coffdegree.length,p1.coffdegree.length); 

    for(int i=0;i<maxLength;i++)
    {
      int coff1 = (i<this.coffdegree.length) ? this.coffdegree[i] : 0;
      int coff2 = (i<p1.coffdegree.length) ? p1.coffdegree[i] :0;
      
      this.setCoefficient(i,coff1+coff2);
    }
  } 

  public void sub(Polynomial p1)
  {
    int maxLength = Math.max(this.coffdegree.length,p1.coffdegree.length); 

    for(int i=0;i<maxLength;i++)
    {
      int coff1 = (i<this.coffdegree.length) ? this.coffdegree[i] : 0;
      int coff2 = (i<p1.coffdegree.length) ? p1.coffdegree[i] :0;
      
      this.setCoefficient(i,coff1-coff2);
    }
  }  

  public void multiply(Polynomial p1)
  {
    Polynomial result = new Polynomial();
     for(int i=0;i<this.coffdegree.length;i++)
     {
      for(int j=0;j<p1.coffdegree.length;j++)
      {
       int newDegree = i+j;
       int newCoff = this.coffdegree[i] * p1.coffdegree[j];
       result.setCoefficient(newDegree,result.getCoefficient(newDegree) + newCoff);
      }
     } 

     this.coffdegree = result.coffdegree;
  }

  public void print()
  {
    for(int i=0;i<coffdegree.length;i++)
    {
      if(coffdegree[i]!=0)
      {
        System.out.print(coffdegree[i] + "x^"+ i +" ");
      }
    }
    System.out.println();
  }

}
