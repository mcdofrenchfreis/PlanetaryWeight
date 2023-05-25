import java.util.Scanner;

class Planet {
    private String name;
    private double gravity;

    public Planet(String name, double gravity) {
        this.name = name;
        this.gravity = gravity;
    }

    public String getName() {
        return name;
    }

    public double calculateWeight(double weight) {
        return weight * gravity;
    }
}

class PlanetaryWeight {
    private static Planet[] planets = {
        new Planet("Mercury", 0.38),
        new Planet("Venus", 0.91),
        new Planet("Earth", 1.0),
        new Planet("Mars", 0.38),
        new Planet("Jupiter", 2.34),
        new Planet("Saturn", 1.06),
        new Planet("Uranus", 0.92),
        new Planet("Neptune", 1.19),
        new Planet("Pluto", 0.06)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter your weight on Earth: ");
            double weight = scanner.nextDouble();

            for (Planet planet : planets) {
                double planetWeight = planet.calculateWeight(weight);
                System.out.printf("%s: %.2f%n", planet.getName(), planetWeight);
            }

            System.out.print("Do you want to calculate again? (y/n): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));
    }
}