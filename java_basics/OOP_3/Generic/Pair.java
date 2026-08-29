//package java_basics.OOP_3.Generic;

public class Pair <T,S>{
T num_1;
S num_2;

public Pair()
{

}

public Pair(T n1, S n2) 
{
num_1 = n1;
num_2 = n2;
}

public T getFirst()
{
 return num_1;
}

public S getSecond()
{
    return num_2;
}


public void setFirst(T n1)
{
  num_1 = n1;
}

public void setSecond(S n2)
{
    num_2 = n2;
}

}
