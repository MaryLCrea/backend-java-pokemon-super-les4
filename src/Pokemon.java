package src;

public class Pokemon {
    private String name;
    private int level;

    public Pokemon() {}


    public Pokemon (String name, int level) {
        this.name = name;
        this.level = level;

    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

        public void attack() {
            System.out.println(name + " doet een standaardaanval.");
    }

    public void levelUp() {
        level++;
        System.out.println(name + " is nu level " + level + "!");
    }
}