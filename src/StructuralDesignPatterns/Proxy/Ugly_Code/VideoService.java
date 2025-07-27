package StructuralDesignPatterns.Proxy.Ugly_Code;

import java.util.HashMap;
import java.util.Map;

// Why is this code problematic?
/*
1. Complexity: Adding more features makes the class harder to maintain.
2. Poor Scalability: Adding new access rules or caching mechanisms requires changes in multiple places.
 */
// VideoService.java
public class VideoService {
    private Map<String, String> cachedVideos = new HashMap<>();
    private Map<String, Integer> requestCounts = new HashMap<>();
    public void playVideo(String userType, String videoName) {
        // Limit requests
        requestCounts.put(userType, requestCounts.getOrDefault(userType, 0) + 1);
        if (requestCounts.get(userType) > 5) {
            System.out.println("Access denied: Too many requests.");
            return;
        }

        // Caching logic
        if (cachedVideos.containsKey(videoName)) {
            System.out.println("Streaming cached video: " + videoName);
        } else {
            System.out.println("Streaming new video: " + videoName);
            cachedVideos.put(videoName, videoName);
        }
    }
}