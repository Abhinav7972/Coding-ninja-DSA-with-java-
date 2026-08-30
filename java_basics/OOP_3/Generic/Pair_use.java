//package java_basics.OOP_3.Generic;

public class Pair_use {

public static void main(String[] args) {
Pair <String,Integer>pinner = new Pair<>("Alpha",1);
Pair <Pair<String,Integer>, Integer>  pp = new Pair<>(); 
pp.setFirst(pinner);
System.out.println(pp.getFirst());
System.out.println(pp.getFirst().getFirst());
System.out.println(pp.getFirst().getSecond());

 Pair <String,Integer> p = new Pair<>();
 p.setFirst("abc");
 p.setSecond(5);
 System.out.println(p.getFirst() + " " + p.getSecond());
 Pair <String,String> ps = new Pair<String,String>("a","b");
 Pair <Integer,Integer> pi = new Pair<Integer,Integer>(2,4);
 Pair <Double,Double> pd = new Pair<Double,Double>(1.1, 2.2);
 System.out.println(ps.getFirst() +" " + ps.getSecond());
 System.out.println(pi.getFirst() +" " + pi.getSecond());
 System.out.println(pd.getFirst() +" " + pd.getSecond());

}
}
