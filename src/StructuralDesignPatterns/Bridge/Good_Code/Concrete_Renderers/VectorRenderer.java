package StructuralDesignPatterns.Bridge.Good_Code.Concrete_Renderers;

import StructuralDesignPatterns.Bridge.Good_Code.Renderer;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius){
        System.out.println("Vector Rendering: Drawing Circle with radius: " + radius);
    }

    @Override
    public void renderRectangle(double width, double height){
        System.out.println("Vector Rendering: Drawing Rectangle with width: " + width +" and height: "+ height);
    }
}
