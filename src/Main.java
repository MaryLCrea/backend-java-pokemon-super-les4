package src;

public class Main {
    public static void main(String[] args) {

        FirePokemon vuurPokemon = new FirePokemon("Vulcan", 15, 70, "Vlammen");
        System.out.println("🔥 FirePokemon:");
        System.out.println("Naam: " + vuurPokemon.getName());
        System.out.println("Level: " + vuurPokemon.getLevel());
        System.out.println("Fire Type: " + vuurPokemon.getFireType());

        vuurPokemon.fireBlast();
        vuurPokemon.ignite();
        vuurPokemon.attack();

        WaterPokemon waterPokemon = new WaterPokemon("Aqua", 12, 60, "Regenstorm");
        System.out.println("💧 WaterPokemon:");
        System.out.println("Naam: " + waterPokemon.getName());
        System.out.println("Level: " + waterPokemon.getLevel());
        System.out.println("Rain Dance: " + waterPokemon.getRainDance());

        waterPokemon.surf();
        waterPokemon.hydroCanon();
        waterPokemon.attack();

        GrassPokemon grassPokemon = new GrassPokemon("Leafy", 10, 50, "Storm Thunder");
        System.out.println("🌿 GrassPokemon:");
        System.out.println("Naam: " + grassPokemon.getName());
        System.out.println("Level: " + grassPokemon.getLevel());
        System.out.println("Storm Thunder: " + grassPokemon.getStormThunder());

        grassPokemon.leaveBlade();
        grassPokemon.leaveStorm();
        grassPokemon.attack();

        ElectricPokemon electricPokemon = new ElectricPokemon("Spark", 18, 80, "Bliksemklap");
        System.out.println("⚡ ElectricPokemon:");
        System.out.println("Naam: " + electricPokemon.getName());
        System.out.println("Level: " + electricPokemon.getLevel());
        System.out.println("Volt Tackle: " + electricPokemon.getVoltTackle());

        electricPokemon.electroThunder();
        electricPokemon.thunderPunch();
        electricPokemon.attack();

    }
}


