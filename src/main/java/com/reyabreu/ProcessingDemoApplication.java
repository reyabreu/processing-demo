package com.reyabreu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProcessingDemoApplication
{
  public static void main(String[] args)
  {
    // enable application UI for processing
    SpringApplicationBuilder builder = new SpringApplicationBuilder(
        ProcessingDemoApplication.class).headless(false);
    ConfigurableApplicationContext context = builder.run(args);
    context.registerShutdownHook();
  }
}
