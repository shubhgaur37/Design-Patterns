package StructuralDesignPatterns.Proxy.Good_Code;

// According to Single Responsibility Principle: the sole responsibility of this class is to play videos
public class VideoService implements VideoServiceInterface {

    // userType will be checke in ProxyVideoService to control access to content: free or premium
    @Override
    public void playVideo(String userType, String videoName){
        System.out.println("Streaming video: "+ videoName  );
    }

}
