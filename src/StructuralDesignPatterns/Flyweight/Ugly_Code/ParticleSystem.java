package StructuralDesignPatterns.Flyweight.Ugly_Code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Problems with this code:
1. Only addresses sprite sharing, not other common properties like color.
2. Complex Management: Manual caching(LLD always says delegate the task) adds complexity and increases code overhead.
3. Limited Scalability: Doesn't fully solve the the memory usage problem, making it inefficient for large scale systems.
 */

public class ParticleSystem {
    private Map<String, String> spriteCache = new HashMap<>();
    private List<Particle> particles = new ArrayList<>();
    public void createParticle(
            String color, String spritePath, float x, float y, float velocity) {
        // Try to reuse sprite from cache
        String sprite =
                spriteCache.computeIfAbsent(spritePath, path -> loadSprite(path));
        particles.add(new Particle(color, sprite, x, y, velocity));
    }

    private String loadSprite(String path) {
        // Simulate loading sprite
        return "Loaded: " + path;
    }
}