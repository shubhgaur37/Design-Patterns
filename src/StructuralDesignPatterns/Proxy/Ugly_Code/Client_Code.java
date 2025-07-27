package StructuralDesignPatterns.Proxy.Ugly_Code;

// Problems with this approach:
/*
1. No Centralised Access Control: 
   The VideoService Class is responsible for both:
   - Checking permissions
   - Providing video content
   This violates the single responsibility principle
2. Code Duplication: Every request requires repetitive permission checks inside the VideoService class.
3. Scalability Issues: If we add more user types or complex access rules, we must significantly modify the VideoService class - making it hard
   to maintain

 */
public class Client_Code {
    // Main.java
        public static void main(String[] args) {
            VideoService videoService = new VideoService();
            // Free user trying to watch a video
            videoService.playVideo("free", "Free Video 1");
            // Premium user trying to watch a video
            videoService.playVideo("premium", "Premium Video 1");
            // Unauthorized user
            videoService.playVideo("guest", "Video 1");
        }
}

/*

Output 1:
Streaming free video: Free Video 1
Streaming premium video: Premium Video 1
Access denied: Invalid user type.

Output 2 :

Streaming new video: Free Video 1
Streaming new video: Premium Video 1
Streaming new video: Video 1

*/