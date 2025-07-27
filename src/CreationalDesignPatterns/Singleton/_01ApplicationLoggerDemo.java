package CreationalDesignPatterns.Singleton;

// works for a single thread access, but fails for multi-threaded applications
class Logger{
    // this is static because if non-static then we will need an object of this class
    // to access the logger which needs instantiation and each object will have its own copy of the logger
    // which is  not allowed as it will break the singleton pattern.
    private static Logger logger = null;

    private Logger(){} // private constructor to prevent instantiation from outside

    public static Logger getLogger(){
        // race condition(Threads competing against each other for initialising logger): Suppose there are two threads A and B. 
        // A checked that logger has not been instantiated so it moves inside the conditional.
        // Now, before thread A could instantiate the logger thread B also moves inside the conditional upon finding that logger is not instantiated.
        // which results in 2 instances of logger being created by both of the threads which violates the Singleton pattern.
        if (logger == null) 
            logger = new Logger(); // create a new instance if one does not exist
        return logger;
    }

    public void log(String message){
        System.out.println("Log : " + message);
    }
}
public class _01ApplicationLoggerDemo {
    public void run(){
        Logger logger = Logger.getLogger(); // Always fetch the same instance
        logger.log("Application Run Started");
    }
}
