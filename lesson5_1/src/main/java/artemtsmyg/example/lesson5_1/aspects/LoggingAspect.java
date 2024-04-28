package artemtsmyg.example.lesson5_1.aspects;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect<ProceedingJoinPoint> {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

//    @Around("@annotation(TrackUserAction)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getClass().getName();
        Object [] args = new Class[]{joinPoint.getClass()};

        logger.info("Method " + methodName + " was called with parameters " +
                Arrays.asList(args));

        return joinPoint.getClass();
    }
}
