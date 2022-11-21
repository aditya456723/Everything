package Customercare;

public class Main {
    public static void main ( String[] args ) {
        Simcard obj = new Simcard( );
        while (true) {
            obj.display( );
            obj.switchcase( );
        }
    }
}
