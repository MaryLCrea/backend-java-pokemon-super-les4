package src;

public class FirePokemon extends Pokemon {
    private int flameThrower;
    private String fireType;

    public FirePokemon(String name, int level, int flameThrower, String fireType) {
        super(name, level);
        this.flameThrower = flameThrower;
        this.fireType = fireType;
    }

    public void fireBlast() {
        System.out.println(getName() + " gebruikt Fire Blast met kracht " + flameThrower + "!");
        }

    public void ignite() {
        System.out.println(getName() + " steekt iets in brand");
        }

        @Override
    public void attack() {
        System.out.println(getName() + " valt aan met een enorme hoeveelheid vuur");
        }

    public int getFlameThrower() {
        return flameThrower;
    }

    public String getFireType() {
        return fireType;
    }

    public void setFlameThrower(int flameThrower) {
        this.flameThrower = flameThrower;
    }

    public void setFireType(String fireType) {
        this.fireType = fireType;
    }
}
