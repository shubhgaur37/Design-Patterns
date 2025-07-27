package StructuralDesignPatterns.Bridge.Good_Code.Concrete_Shapes;

import StructuralDesignPatterns.Bridge.Good_Code.Renderer;
import StructuralDesignPatterns.Bridge.Good_Code.Shape;

public class Circle extends Shape {
    private double radius;
    public Circle(Renderer renderer, double radius){
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw(){
        renderer.renderCircle(this.radius);
    }
}
