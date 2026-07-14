public class Data_type {
    public static void main(String[] args) {
        //datatype in java
    ///data type represent type of data and size of data
    //size of data type matters to store different type of data according to there size
    //efficient data type helps us save memory and make program efficient and fast 
     
    //integral data tyoes
    byte players = 11;
    short score = 242;
    int seating = 60000;
    long collection = 1234567891;

    System.out.println(players);
    System.out.println(score);
    System.out.println(seating);
    System.out.println(collection);


    //floating point data type
    //by default java consider every floating point as double so to use float we need to use f
    float f = 10.25573288834334344f;
    double d = 100.222341122321123232323231123; //double used for double precision data 
    System.out.println(f);
    System.out.println(d);


    //other primitive data types 


    char a = 'a';  //character data type to store single character in single quotes 
                   //internally char stored in binary using ASCII table such as a for 97
     char b = 97;  //java use  unicodes for other symbols and language like 'u1234'
    
    
    System.out.println(a);
    System.out.println(b);


    //boolean data types 
    boolean agree = true;

    System.out.println(agree);


    }
}
