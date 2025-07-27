package CreationalDesignPatterns.Singleton;

// works for a single thread access, but fails for multi-threaded applications
class Logger{
    // this is static because if non-static then we will need an object of this class
    // to access the logger which needs instantiation and each object will have its own copy of the logger
    // which is  not allowed as it will break the singleton pattern.
    private static Logger logger = null;

    private Logger(){} // private constructor to prevent instantiation from outside

    // we should only make the threads wait until the logger is initialised and then enable concurrent access.
    public static Logger getLogger(){
        if (logger == null) // First Check (no synchronization needed here)
        synchronized(Logger.class){
            if (logger == null) // second check (inside synchronized block)
            // create a new instance if one does not exist, only one thread will create the instance
                logger = new Logger();
        }

        return logger;
    }

    // In the above code, the first check ensures that threads can access the logger if its already initialised
    // incase if it is not then we move all the threads at any given point of time inside the first conditional and then into the synchronized block
    // one by one. Multiple threads will only check the 2nd conditional for the time the logger has not been initialised.
    // Post that point of time, none of the threads will need to enter the synchronized block to check conditional 2 and will be able to concurrently
    // access the logger.

    public void log(String message){
        System.out.println("Log : " + message);
    }
}
public class _03ApplicationLoggerMultithreadingDemoMultiLocking {
    public void run(){
        Logger logger = Logger.getLogger(); // Always fetch the same instance
        logger.log("Application Run Started");
    }
}
