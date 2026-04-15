package week8;
import org.apache.logging.log4j.*;

public class logger {
    public static Logger log(Class cls)
    {
        return LogManager.getLogger(cls);
    }
}
