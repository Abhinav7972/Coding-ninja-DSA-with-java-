
public class Dynamic_array {

private int []data;
public int nextIndex;
public Dynamic_array()
{
    data = new int[5];
    nextIndex = 0;
}

public int getSize()
{
return nextIndex;
}

public int getItem(int i)
{
if(i>=nextIndex)
{
    return 0;
}

return data[i];

} 

public void setItem(int i,int el)
{
    if(i>=nextIndex)
    {
      return;
      //throw error ideally
    }

    data[i] = el;
}


public boolean isEmpty()
{
 return nextIndex ==0;
} 

public void add(int el)
{

    if(nextIndex == data.length)
    {
        doublecapicity();
    }

data[nextIndex] =  el; 
nextIndex++;
}

private void doublecapicity()
{
    int temp [] = data;
    data = new int[2*temp.length];

    for(int i=0;i<temp.length;i++)
    {
        data[i] = temp[i];
    }
}

public int removeLast()
{
    if(nextIndex==0)
    {
        return -1;
    }

    int temp = data[nextIndex-1];
    data[nextIndex-1] = 0;
    nextIndex --;
    return temp;
}


}
