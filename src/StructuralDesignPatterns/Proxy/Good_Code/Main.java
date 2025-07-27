package StructuralDesignPatterns.Proxy.Good_Code;

// Advantages of Using this pattern: or What we achieved in the implementation example?
/*
1. Centralised Access Control: The proxy manages access rules, ensuring consistent and secure access to the real service.
2. Caching: Frequently requested videos can be cached in the proxy, reducing bandwidth usage and improving performance.
3. Request Limiting: The proxy can enforce limits on user access, preventing abuse of service.

 */
public class Main {
    public static void main(String[] args) {
        VideoService realService = new VideoService();
        ProxyVideoService proxyService = new ProxyVideoService(realService);
        // Free user trying to watch a video
        proxyService.playVideo("Free", "Free Video 1");
        // Premium user trying to watch a video
        proxyService.playVideo("Premium", "Premium Video 1");
        // Unauthorized user
        proxyService.playVideo("guest", "Video 1");
        // Too many requests
        for (int i = 0; i < 6; i++) {
            proxyService.playVideo("free", "Free Video 2");
        }
    }
}
