package StructuralDesignPatterns.Bridge.Good_Code;

public abstract class Shape {
    protected Renderer renderer;

    public Shape(Renderer renderer){
        this.renderer = renderer;
    }

    public abstract void draw();
}
