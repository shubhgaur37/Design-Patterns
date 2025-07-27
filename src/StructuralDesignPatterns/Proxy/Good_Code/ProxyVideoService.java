package StructuralDesignPatterns.Proxy.Good_Code;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoService implements VideoServiceInterface {   
    private VideoService videoService;
    private Map<String, Integer> requestCount; // for rate limiting
    private Map<String, String> cachedVideos; // for caching vides based on subscription type

    public ProxyVideoService(VideoService videoService){
        this.videoService = videoService;
        this.requestCount = new HashMap<>();
        this.cachedVideos = new HashMap<>();
    }

    // The below code is not a very good code and could further be improved using different design patterns
    @Override
    public void playVideo(String userType, String videoName){
        // access control check: user permissions
        if (!userType.equals("Premium") && videoName.contains("Premium")){
            System.out.println("Access Denied: Free Users are not authorised to play premium content");
            return;
        }

        // Limit Requests
        // counting the requests made by a user based on type
        requestCount.put(userType,requestCount.getOrDefault(userType, 0)+1);

        // specify limit
        if (requestCount.get(userType) > 4)
            System.out.println("Access Denied: Too Many Requests");
        
        
        // Cache videos
        if (cachedVideos.containsKey(videoName))
            System.out.println("Streaming cached video: " + videoName);
        else{
            // play video
            videoService.playVideo(userType, videoName);
            // cache the video
            cachedVideos.put(videoName, videoName);
        }

    }
}
