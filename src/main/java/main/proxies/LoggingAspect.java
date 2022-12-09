package main.proxies;


import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
   @Around("execution(* services.*.*(..))")
    public void log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
            logger.info("Log method will be executed");
            proceedingJoinPoint.proceed();
            logger.info("Execution finished");
   }
}
