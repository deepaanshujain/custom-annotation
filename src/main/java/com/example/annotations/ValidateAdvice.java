package com.example.annotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidateAdvice {
	
	Logger logger = LoggerFactory.getLogger(LogExecutionTimeAdvice.class);
	
	//@Around("@annotation(com.example.annotations.LogExecutionTime)")
	@Before("@annotation(com.example.annotations.Validate)")
	public Object validateFields(ProceedingJoinPoint pjp) throws Throwable {
		
		
		
		logger.info("----------------- - "+pjp.getThis());
		
		return pjp;
		
	}

}
