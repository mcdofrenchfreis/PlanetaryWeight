import java.util.Scanner;
import my.planet.enums.Planets;

public class PlanetaryWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat;

        do {
            System.out.print("Enter your weight on Earth: ");
            int weightOnEarth = scanner.nextInt();
            System.out.println("\nPlanet\t\tWeight");

            for (Planets planet : Planets.values()) {
                double planetaryWeight = weightOnEarth * planet.getGravityFactor();
                System.out.printf("%-10s\t%,10.2f%n", planet, planetaryWeight);
            }

            System.out.print("\nDo you want to calculate again? (Y/N): ");
            repeat = scanner.next().equalsIgnoreCase("Y");
            System.out.println();
        } while (repeat);
    }
}
