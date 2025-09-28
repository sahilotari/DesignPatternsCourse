package org.sahilo.CreationalPatterns.BuilderPattern.Problem;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;
    private Boolean hasGarage;
    private Boolean hasSwimmingPool;
    private Boolean hasGarden;

    // Constructor with all parameters
    public House(String foundation, String structure, String roof, String interior, Boolean hasGarage, Boolean hasSwimmingPool, Boolean hasGarden) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.interior = interior;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasGarden = hasGarden;
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
}
