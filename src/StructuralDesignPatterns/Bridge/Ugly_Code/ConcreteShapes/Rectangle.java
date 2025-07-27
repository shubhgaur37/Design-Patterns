package StructuralDesignPatterns.Bridge.Ugly_Code.ConcreteShapes;

import StructuralDesignPatterns.Bridge.Ugly_Code.Shape;

public class Rectangle extends Shape {
    @Override
    public void rasterDraw() {
        System.out.println("Drawing Rectangle using Raster Rendering");
    }
}