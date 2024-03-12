public class Capital {
    private String name;
    private String population;
    private double sqrMiles;

    public Capital(String name, String population, double sqrMiles) {
        this.name = name;
        this.population = population;
        this.sqrMiles = sqrMiles;
    }

    public String getName() {
        return name;
    }


    public String getPopulation() {
        return population;
    }


    public double getSqrMiles() {
        return sqrMiles;
    }

}