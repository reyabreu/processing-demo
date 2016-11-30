package com.reyabreu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Ensures headless = false by using context builders so that Swing toolkit will be able to set up
 * correctly a Processing UI. The rest is to perform graceful Spring boot setup and shutdown.
 * 
 * @author Reynaldo.A
 *
 */
@SpringBootApplication
public class ProcessingDemoApplication
{
  public static void main(String[] args)
  {
    // enable application UI for processing
    SpringApplicationBuilder builder = new SpringApplicationBuilder(
        ProcessingDemoApplication.class)
            .headless(false);
    ConfigurableApplicationContext context = builder.run(args);
    context.registerShutdownHook();
  }
}
