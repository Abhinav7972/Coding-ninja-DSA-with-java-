public class recursion_tower_of_hanoi {

public static void towerofhanoi(int n,char s,char h, char d)
{
if(n==1)
{
    System.out.println(s+" "+d);
    return;
}

towerofhanoi(n-1, s, d, h);
System.out.println(s + " "+d);
towerofhanoi(n-1, h, s, d);

}

public static void main(String[] args) {
towerofhanoi(3, 's', 'h', 'd');
}
}
