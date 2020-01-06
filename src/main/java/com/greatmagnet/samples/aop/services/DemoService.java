package com.greatmagnet.samples.aop.services;

import com.greatmagnet.samples.aop.annotations.LogMethodExecution;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * A simple example of a service class in which business or other application logic would normally
 * reside.
 */
@Service
public class DemoService {

  private static Logger logger = LogManager.getLogger(DemoService.class);

  @LogMethodExecution
  public void firstMethod() {

    logger.info("First method body.");

  }

  @LogMethodExecution
  public void secondMethod() {

    logger.info("Second method body.");

  }

}
