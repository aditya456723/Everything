package Game;

public class Player1 {

    private String name;
    private String Weapon;
    private int health;

    Player1(String name, String Weapon, int health){
        this.name = name;
        this.Weapon = Weapon;
        if(health < 0 || health>100) this.health = 100;
        else this.health = health;
    }

    public void damagebygun1(){
        this.health -=30;
        if (health <=0){
            System.out.println("Player is dead" );

        }
        else {
            System.out.println(getName()+"is shot, Health"+getHealth());

        }
    }

    public void damagebygun2(){
        this.health -=50;
        if (health <=0){
            System.out.println("Player is dead" );

        }
        else {
            System.out.println(getName()+"is shot, Health"+getHealth());

        }
    }


    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getWeapon ( ) {
        return Weapon;
    }

    public void setWeapon ( String weapon ) {
        Weapon = weapon;
    }

    public int getHealth ( ) {
        return health;
    }

    public void setHealth ( int health ) {
        this.health = health;
    }
}
