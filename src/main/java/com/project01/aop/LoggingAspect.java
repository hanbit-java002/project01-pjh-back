package com.project01.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
@Order(2)
public class LoggingAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@Around("execution(* com.project01..controller..*.*(..))")
	public Object doLogging(ProceedingJoinPoint joinPoint) throws Throwable {
		ServletRequestAttributes requestAttributes = 
			(ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		
		HttpServletRequest request = requestAttributes.getRequest();
		String remoteAddr = request.getRemoteAddr();
		
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		String className = methodSignature.getMethod().getDeclaringClass().getSimpleName();
		String methodName = methodSignature.getMethod().getName();
		
		LOGGER.debug(className + "." + methodName + " has bean called by " + remoteAddr);
		
		return joinPoint.proceed();
	}
	
}