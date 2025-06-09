package src;

public class ElectricPokemon extends Pokemon{

        private int electroBall;
        private String voltTackle;

        public ElectricPokemon(String name, int level, int electroBall, String voltTackle) {
            super(name, level);
            this.electroBall = electroBall;
            this.voltTackle = voltTackle;
        }

        public void electroThunder() {
            System.out.println(getName() + " gebruikt Electro Ball met kracht " + electroBall + "!");
        }

        public void thunderPunch() {
            System.out.println(getName() + " zet iets onder stroom");
        }

        @Override
        public void attack() {
            System.out.println(getName() + " valt aan met elektriciteit");
        }

        public int getElectroBall() {
            return electroBall;
        }

        public String getVoltTackle() {
            return voltTackle;
        }

        public void setElectroBall(int electroBall) {
            this.electroBall = electroBall;
        }

        public void setVoltTackle(String voltTackle) {
            this.voltTackle = voltTackle;
        }
    }
