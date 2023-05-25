class Planet:
    def __init__(self, planet_name, gravity_factor):
        self.planet_name = planet_name
        self.gravity_factor = gravity_factor

class PlanetaryWeight:
    planets = [
        Planet("Mercury", 0.38),
        Planet("Venus", 0.91),
        Planet("Earth", 1.0),
        Planet("Mars", 0.38),
        Planet("Jupiter", 2.34),
        Planet("Saturn", 1.06),
        Planet("Uranus", 0.92),
        Planet("Neptune", 1.19),
        Planet("Pluto", 0.06)
    ]

    @staticmethod
    def calculate_planetary_weight(weight):
        for planet in PlanetaryWeight.planets:
            planetary_weight = weight * planet.gravity_factor
            print(f'{planet.planet_name}: {planetary_weight:.2f}')

    @staticmethod
    def run():
        while True:
            weight = int(input("Enter your weight on Earth: "))
            PlanetaryWeight.calculate_planetary_weight(weight)

            choice = input("Do you want to do the calculations again? (y/n): ")
            if choice.lower() != 'y':
                break

PlanetaryWeight.run()
