package StructuralDesignPatterns.Bridge.Ugly_Code;

// Problems with this approach:
/*
1. No Flexibility for Rendering Methods: If we need to add vector rendering, we need to add it in the abstract class, and provide the implementation
   in each of its subclasses.
2. Code Duplication: Each shape must implement the corresponding rendering logic, leading to repeated code.
3. Poor Scalability: Adding new shapes or new rendering methods requires significant changes, increasing maintenance overhead.
 */
public abstract class Shape {
    public abstract void rasterDraw();
}