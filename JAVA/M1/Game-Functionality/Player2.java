package Game;

public class Player2 extends Player1 {
    private int health;
    private boolean armor;

    public Player2 ( String name, String Weapon, int health, boolean armor ) {
        super( name, Weapon, health );
        if (health <0 || health >100) this.health = 100;
        else this.health = health;
        this.armor = armor;
    }

    @Override
    public void damagebygun1 ( ) {
        if (armor) {
            this.health -= 20;
            if (this.health <= 0) this.health = 0;
            System.out.println( "armor is on " + getName() + " got hit, Health:" + this.health );
        }if (!armor) {
            this.health -= 30;
            if (this.health <= 0) this.health = 0;
            System.out.println( "armor is off" + getName( ) + "got hit, Health:" + this.health);
        }
        if (this.health == 0) {
            System.out.println( getName( ) + "is dead" );
        }

    }

    public void damagebygun2 ( ) {
        if (armor) {
            this.health -= 40;
            if (this.health <= 0) this.health = 0;
            System.out.println( "armor is on " + getName() + " got hit, Health:" + this.health );
        }if (!armor) {
            this.health -= 50;
            if (this.health <= 0) this.health = 0;
            System.out.println( "armor is off" + getName( ) + "got hit, Health:" + this.health);
        }
        if (this.health == 0) {
            System.out.println( getName( ) + "is dead" );
        }

    }

    public void heal(){
        if (this.health <= 0) System.out.println( "Player is dead can't heal" );
        else{
            this.health = 100;
            System.out.println(this.health );
        }
    }


}


