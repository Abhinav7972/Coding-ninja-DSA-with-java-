public class Explicit {
    public static void main(String[] args) {
        short currentYear = 2026;
        byte age  = 30;

        short birthYear = (short) (currentYear - age);
        System.out.println(birthYear);
    }

}