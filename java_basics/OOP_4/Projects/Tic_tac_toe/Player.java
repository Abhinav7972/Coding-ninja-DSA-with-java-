//package java_basics.OOP_4.Projects.Tic_tac_toe;

public class Player {
private String name; 
private char Symbol; 

public Player(String name, char symbol)
{
setName(name);
setSymbol(symbol);
}

public  void setName(String name)
{
    if(!name.isEmpty())
    {
      this.name = name;
    }
    
}

public void setSymbol(char symbol)
{
    if(symbol!= '\0')
    {
        this.Symbol = symbol;
    }
}

public String getName()
{
    return this.name;
}

public char getSymbol()
{
    return this.Symbol;
}
}
