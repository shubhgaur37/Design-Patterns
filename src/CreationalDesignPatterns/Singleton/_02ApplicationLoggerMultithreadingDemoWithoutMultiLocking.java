package CreationalDesignPatterns.Singleton;

// works for a single thread access, but fails for multi-threaded applications
class Logger{
    // this is static because if non-static then we will need an object of this class
    // to access the logger which needs instantiation and each object will have its own copy of the logger
    // which is  not allowed as it will break the singleton pattern.
    private static Logger logger = null;

    private Logger(){} // private constructor to prevent instantiation from outside
    // Synchronized method to ensure only one thread can invoke the function at any given point of time
    // but the issue here is , that we are compelling the threads to wait each time even if the logger is already initialised 
    // which adds unnecessary perfoermance overhead and slows down the application
    // instead of doing this, we should only make the threads wait until the logger is initialised and 
    // then enable concurrent access.
    public static synchronized Logger getLogger(){
        if (logger == null) 
            logger = new Logger(); // create a new instance if one does not exist, only one thread will create the instance
        return logger;
    }

    public void log(String message){
        System.out.println("Log : " + message);
    }
}
public class _02ApplicationLoggerMultithreadingDemoWithoutMultiLocking {
    public void run(){
        Logger logger = Logger.getLogger(); // Always fetch the same instance
        logger.log("Application Run Started");
    }
}
