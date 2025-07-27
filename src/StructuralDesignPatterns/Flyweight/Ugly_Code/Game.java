package StructuralDesignPatterns.Flyweight.Ugly_Code;

import java.util.ArrayList;
import java.util.List;

/*
Problems with this approach:
1. Memory Wastage: Each particle object stores identical sprite and color data (eg. particles with color red will have different 
string objects referring to the same value if string pool is not used and separate objects are created which is mostly the case in production), 
leading to duplicate memory usage.
2. Object Overhead: Creating thousands of objects puts pressure on garbage collection, leading to performance issues.
3. Poor Performance: The large number of objects causes slower execution, making the game laggy.
 */

// Game.java
public class Game {
    public static void main(String[] args) {
        List<Particle> particles = new ArrayList<>();
        // Create thousands of particles
        for (int i = 0; i < 10; i++) {
            particles.add(new Particle(new String("red"), new String("explosion.png"),
                    (float) Math.random() * 100, (float) Math.random() * 100, 1.0f));
        }

        // Update all particles
        for (Particle particle : particles) {
            particle.update();
        }
    }
}

/*

Output :
Particle at position (33.058727,26.421703) with color red
Particle at position (46.950348,74.93467) with color red
Particle at position (78.90016,97.17686) with color red
Particle at position (20.298702,22.99473) with color red
Particle at position (20.6473,25.858097) with color red
Particle at position (6.895513,51.45678) with color red
Particle at position (98.83289,90.49077) with color red
Particle at position (34.522118,20.98982) with color red
Particle at position (75.96805,38.90382) with color red
Particle at position (90.962494,6.158177) with color red

*/