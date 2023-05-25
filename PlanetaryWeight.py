class Planet:
    def __init__(self, name, gravity):
        self.name = name
        self.gravity = gravity

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
    def calculate_weight(weight):
        for planet in PlanetaryWeight.planets:
            planet_weight = weight * planet.gravity
            print(f'{planet.name}: {planet_weight:.2f}')

    @staticmethod
    def run():
        while True:
            weight = int(input("Enter your weight on Earth: "))
            PlanetaryWeight.calculate_weight(weight)

            choice = input("Do you want to calculate again? (y/n): ")
            if choice.lower() != 'y':
                break

PlanetaryWeight.run()
