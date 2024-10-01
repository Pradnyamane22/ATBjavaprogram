package sept.exe018;

public class lab32narrowing {
    public static void main(String[] args) {
    }
    long phone_no = 9876543210l;
    //short s = phone_no; // Narrowing - Implicit - JVM // Invalid
    short s1 = (short)phone_no; // Narrowing - Explicit - Loss // Invalid
}
