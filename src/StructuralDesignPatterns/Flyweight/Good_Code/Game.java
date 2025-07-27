package StructuralDesignPatterns.Flyweight.Good_Code;

import java.util.ArrayList;
import java.util.List;

/*
What did we achieve?
1. Significant memory savings: by creating an explosionType(graphical effect) for a game based on color and image path.
2. Instead of storing color and sprite data for each of the particles, we store this data just once in the Particle Type flyweight. Because if in an
   explosion we have 1000 particles we don't separately need to store the color and sprite[intrinsic properties] of each of the particles 
   in different objects.
3. Each particle only needs to store:
   -> Its own position and velocity
   -> A reference to the shared particle type.

The Magic of Flyweight pattern:
1. If we create 1000 red explosion particles, they all share the same ParticleType Instance with shared property.
2. If we later need blue explosion particle, we create a single ParticleType instance for all blue particles
3. Dramatically reducing memory usage while maintaining flexibility.
 */
// Game.java
public class Game {
    public static void main(String[] args) {
        ParticleTypeFactory factory = new ParticleTypeFactory();
        List<Particle> particles = new ArrayList<>();
        // Create thousands of particles using shared flyweights
        ParticleType explosionType = factory.getParticleType("red", "explosion.png");

        for (int i = 0; i < 10; i++) {
            particles.add(new Particle(explosionType,
                    (float) Math.random() * 100,
                    (float) Math.random() * 100,
                    1.0f));
        }
        // Update all particles
        for (Particle particle : particles) {
            particle.update();
        }
    }
}
/*Advantages of Using this Pattern:
1. Memory Efficiency: Dramatically reduces memory usage by sharing common data instead of duplicating it.
2. Performance: Fewer objects mean better garbage collection performance, leading to faster execution.
3. Scalability: Supports large number of similar objects efficiently, making it ideal for high-performance applications.
4. Maintenance: Clear Separation between shared(intrinsic) state and unique(extrinsic) state, keeping the code clean and manageable.
 */

/*

Output :
Rendering red particle at (21.416668,84.93594) with sprite explosion.png
Rendering red particle at (61.41813,91.2915) with sprite explosion.png
Rendering red particle at (36.802338,69.7141) with sprite explosion.png
Rendering red particle at (72.986206,27.286) with sprite explosion.png
Rendering red particle at (19.864418,15.151333) with sprite explosion.png
Rendering red particle at (77.864944,79.50962) with sprite explosion.png
Rendering red particle at (69.51494,57.23417) with sprite explosion.png
Rendering red particle at (70.96872,79.69071) with sprite explosion.png
Rendering red particle at (81.395744,33.05773) with sprite explosion.png
Rendering red particle at (3.8059301,8.231289) with sprite explosion.png

*/
