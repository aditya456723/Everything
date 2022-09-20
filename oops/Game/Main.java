package Game;

public class Main {
    public static void main(String[] args){
        Player2 obj1 = new Player2( "ironman", "gun",100,false );
        obj1.damagebygun1();
        obj1.damagebygun2();
        obj1.heal();
        obj1.damagebygun1();

    }
}
