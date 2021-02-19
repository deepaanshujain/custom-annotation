package com.example.annotations;

import org.slf4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogExecutionTimeAdvice {

	Logger logger = LoggerFactory.getLogger(LogExecutionTimeAdvice.class);

	@Around("@annotation(com.example.annotations.LogExecutionTime)")
	public Object logTime(ProceedingJoinPoint pjp) throws Throwable {
		Long startTime = System.currentTimeMillis();
		Object obj = pjp.proceed();
		Long endTime = System.currentTimeMillis();
		
		logger.info("Time Taken by method - "+pjp.getSignature() +" is " + (startTime - endTime));
		

		return obj;
	}

}
