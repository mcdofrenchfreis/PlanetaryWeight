package my.planet.enums;

public enum Planets {
    MERCURY("Mercury", 0.38), VENUS("Venus", 0.91), EARTH("Earth", 1.0), MARS("Mars", 0.38),
    JUPITER("Jupiter", 2.34), SATURN("Saturn", 1.06), URANUS("Uranus", 0.92), NEPTUNE("Neptune", 1.19),
    PLUTO("Pluto", 0.06);

    private final String planetName;
    private final double gravityFactor;

    private Planets(String planetName, double gravityFactor) {
        this.planetName = planetName;
        this.gravityFactor = gravityFactor;
    }

    public String getPlanetName() { return planetName; }

    public double getGravityFactor() { return gravityFactor; }

    @Override
    public String toString() { return planetName; }
}
