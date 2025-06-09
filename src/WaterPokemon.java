package src;

public class WaterPokemon extends Pokemon {
    private int hydroPump;
    private String rainDance;

    public WaterPokemon (String name, int level, int hydroPump, String rainDance) {
        super(name, level);
        this.hydroPump = hydroPump;
        this.rainDance = rainDance;
    }

    public void surf() {
        System.out.println(getName() + " gebruikt Hydro Pump met kracht " + hydroPump + "!");
    }

    public void hydroCanon() {
        System.out.println(getName() + " is een gevaar met water");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " valt aan met water");
    }

    public int getHydroPump() {
        return hydroPump;
    }

    public String getRainDance() {
        return rainDance;
    }

    public void setHydroPump(int hydroPump) {
        this.hydroPump = hydroPump;
    }

    public void setRainDance(String rainDance) {
        this.rainDance = rainDance;
    }
}

