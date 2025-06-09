package src;

    public class GrassPokemon extends Pokemon{

        private int psyBeam;
        private String stormThunder;

        public GrassPokemon(String name, int level, int psyBeam, String stormThunder) {
            super(name, level);
            this.psyBeam = psyBeam;
            this.stormThunder = stormThunder;

        }

        public void leaveBlade() {
            System.out.println(getName() + " gebruikt Psy Beam om te toveren met kracht " + psyBeam + "!");
        }

        public void leaveStorm() {
            System.out.println(getName() + " zorgt voor noodweer");
        }

        @Override
        public void attack() {
            System.out.println(getName() + " valt aan met natuur");
        }

        public int getPsyBeam() {
            return psyBeam;
        }

        public String getStormThunder() {
            return stormThunder;
        }

        public void setPsyBeam(int psyBeam) {
            this.psyBeam = psyBeam;
        }

        public void setStormThunder(String stormThunder) {
            this.stormThunder = stormThunder;
        }
    }
