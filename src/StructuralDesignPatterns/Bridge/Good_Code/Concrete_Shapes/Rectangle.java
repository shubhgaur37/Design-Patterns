package StructuralDesignPatterns.Bridge.Good_Code.Concrete_Shapes;

import StructuralDesignPatterns.Bridge.Good_Code.Renderer;
import StructuralDesignPatterns.Bridge.Good_Code.Shape;

public class Rectangle extends Shape {
    private double width, height; 

    public Rectangle(Renderer renderer, double width, double height){
        super(renderer);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(){
        renderer.renderRectangle(this.width, this.height);
    }
}
