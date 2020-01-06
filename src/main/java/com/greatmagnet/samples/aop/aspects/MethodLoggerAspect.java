package com.greatmagnet.samples.aop.aspects;

import com.greatmagnet.samples.aop.annotations.LogMethodExecution;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * An example of an aspect that will log a message before and after the invocation of methods
 * annotated with the {@link LogMethodExecution} annotation.
 */
@Component
@Aspect
public class MethodLoggerAspect {

  private static Logger logger = LogManager.getLogger(MethodLoggerAspect.class);

  /**
   * Creates a log message before the invocation of every method annotated with {@link
   * LogMethodExecution}.
   *
   * @param joinPoint The joinPoint, used to get the name of the method being called.
   */
  @Before("@annotation(com.greatmagnet.samples.aop.annotations.LogMethodExecution)")
  public void beforeMethodExecution(JoinPoint joinPoint) {

    logger.info("Method executed before method with name: " + joinPoint.getSignature().getName());

  }

  /**
   * Creates a log message after the invocation of every method annotated with {@link
   * LogMethodExecution}.
   *
   * @param joinPoint The joinPoint, used to get the name of the method being called.
   */
  @After("@annotation(com.greatmagnet.samples.aop.annotations.LogMethodExecution)")
  public void afterMethodExecution(JoinPoint joinPoint) {

    logger.info("Method executed after method with name: " + joinPoint.getSignature().getName());

  }

}
