package StructuralDesignPatterns.Bridge.Good_Code;

// Interface to render different shapes
// we are defining the logic to render different shapes because shapes are unlikely to evolve.
// On the othe hand rendering logic can evolve with different renderers i.e. Raster, Vector, etc.
public interface Renderer {
    void renderRectangle(double width, double height);
    void renderCircle(double radius);
}
