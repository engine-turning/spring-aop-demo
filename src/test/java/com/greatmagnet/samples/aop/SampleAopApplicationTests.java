package com.greatmagnet.samples.aop;

import com.greatmagnet.samples.aop.services.DemoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SampleAopApplication.class})
class SampleAopApplicationTests {

  @Autowired
  private DemoService demoService;

  /**
   * Test that will invoke the two service methods to demonstrate the {@link
   * com.greatmagnet.samples.aop.aspects.MethodLoggerAspect} functionality.
   */
  @Test
  public void aspectTest() {

    demoService.firstMethod();

    demoService.secondMethod();

  }

}
