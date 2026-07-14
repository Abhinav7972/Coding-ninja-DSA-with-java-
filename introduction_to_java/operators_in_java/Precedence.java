public class Precedence {
    public static void main(String[] args) {
        int a=8,b=7,c=6;
        
        System.out.println((a+b+c)/3); //bracket have highest precednece 
        System.out.println(a+b+c/3); //without bracked here divide operator execute first based on precedence
        System.out.println(((10-5)/(3+6))*10);
    }
}
