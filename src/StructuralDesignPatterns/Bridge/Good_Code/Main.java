package StructuralDesignPatterns.Bridge.Good_Code;

import StructuralDesignPatterns.Bridge.Good_Code.Concrete_Renderers.*;
import StructuralDesignPatterns.Bridge.Good_Code.Concrete_Shapes.Circle;
import StructuralDesignPatterns.Bridge.Good_Code.Concrete_Shapes.Rectangle;

// Advantages of Using this pattern:
/*
1. Decoupling: Shapes and rendering methods are decoupled, allowing them to vary independently.
2. Scalability: Adding a new shape or rendering method requires minimal changes.
3. Reusability: Rendering logic can be reused across different shapes.
4. Maintainability: Code is cleaner and easier to maintain, as each class has a single responsibility.

 */
public class Main {
    public static void main(String[] args) {
        // Initialising Renderers
        Renderer rasterRenderer = new RasterRenderer();
        Renderer vectorRenderer = new VectorRenderer();

        // Initialising shapes with different renderers
        Shape circle1 = new Circle(vectorRenderer, 4.2);
        Shape circle2 = new Circle(rasterRenderer, 4.5);

        Shape rectangle1 = new Rectangle(vectorRenderer, 5,4);
        Shape rectangle2 = new Rectangle(rasterRenderer, 6, 10);

        // Drawing shapes with different renderings
        circle1.draw();
        circle2.draw();
        rectangle1.draw();
        rectangle2.draw();

    }
}
