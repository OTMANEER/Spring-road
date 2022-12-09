package main.proxies;


import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.validation.ObjectError;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
   @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
            logger.info("Log method will be executed");
            String methodName = proceedingJoinPoint.getSignature().getName();
            Object[] params = proceedingJoinPoint.getArgs();
            Object returnedByMethod = proceedingJoinPoint.proceed();
            logger.info("Method executed and returned "+returnedByMethod);
   return returnedByMethod;
   }
}
