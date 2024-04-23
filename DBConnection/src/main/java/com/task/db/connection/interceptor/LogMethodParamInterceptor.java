package com.task.db.connection.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogMethodParamInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(LogMethodParamInterceptor.class);

    public void logMethodParams(JoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Method: {} - Parameters: {}", methodName, args);
    }
}
