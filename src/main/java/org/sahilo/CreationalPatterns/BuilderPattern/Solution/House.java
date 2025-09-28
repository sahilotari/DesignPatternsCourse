package org.sahilo.CreationalPatterns.BuilderPattern.Solution;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;
    private Boolean hasGarage;
    private Boolean hasSwimmingPool;
    private Boolean hasGarden;

    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.interior = builder.interior;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
    }


    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", interior='" + interior + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }

    public static class HouseBuilder{
        private String foundation;
        private String structure;
        private String roof;
        private String interior;
        private Boolean hasGarage;
        private Boolean hasSwimmingPool;
        private Boolean hasGarden;

        public HouseBuilder(String foundation, String structure, String roof) {
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }

        // Optional parameters with setter methods
        public HouseBuilder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public HouseBuilder setHasGarage(Boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(Boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setHasGarden(Boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
