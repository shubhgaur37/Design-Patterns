package StructuralDesignPatterns.Bridge.Ugly_Code.ConcreteShapes;

import StructuralDesignPatterns.Bridge.Ugly_Code.Shape;

public class Circle extends Shape {
    @Override
    public void rasterDraw() {
        System.out.println("Drawing Circle using Raster Rendering");
    }
}
