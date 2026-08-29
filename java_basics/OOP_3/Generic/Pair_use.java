//package java_basics.OOP_3.Generic;

public class Pair_use {

public static void main(String[] args) {
 Pair <String> ps = new Pair<String>("a","b");
 Pair <Integer> pi = new Pair<Integer>(2,4);
 Pair <Double> pd = new Pair<Double>(1.1, 2.2);
 System.out.println(ps.getFirst() +" " + ps.getSecond());
 System.out.println(pi.getFirst() +" " + pi.getSecond());
 System.out.println(pd.getFirst() +" " + pd.getSecond());

}
}
