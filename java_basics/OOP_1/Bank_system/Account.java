//package java_basics.OOP_1.Bank_system;

public class Account {
private String name;
private int Acc_no; 

public  String getName()
{
return name;
} 

public int getAcc_no()
{
    return Acc_no;
}

public  void setDetails(int Acc_no,String name)
{
if(Acc_no<=0)
{
    return;
}
this.Acc_no = Acc_no;
this.name = name;
}

}
