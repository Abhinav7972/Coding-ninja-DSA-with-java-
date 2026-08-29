//package java_basics.OOP_3.Generic;

public class Pair <T>{
T num_1;
T num_2;

public Pair(T n1, T n2) 
{
num_1 = n1;
num_2 = n2;
}

public T getFirst()
{
 return num_1;
}

public T getSecond()
{
    return num_2;
}


public void setFirst(T n1)
{
  num_1 = n1;
}

public void setSecond(T n2)
{
    num_2 = n2;
}

}
