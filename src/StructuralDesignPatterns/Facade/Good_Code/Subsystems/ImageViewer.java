package StructuralDesignPatterns.Facade.Good_Code.Subsystems;

public class ImageViewer {
    public void loadImageFile(){
        System.out.println("Image File loaded");
    }

    public void applyScaling(){
        System.out.println("Image Scaled.");
    }

    public void displayImage(){
        System.out.println("Image Displayed.");
    }
}
