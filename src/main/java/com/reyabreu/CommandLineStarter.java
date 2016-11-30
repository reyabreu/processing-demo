package com.reyabreu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import processing.core.PApplet;

/**
 * Creates the main Processing UI with standard starter methods.
 * 
 * @author Reynaldo.A
 *
 */
@Component
public class CommandLineStarter implements CommandLineRunner
{

  @Override
  public void run(String... args) throws Exception
  {
    PApplet.main(ProcessingCanvas.class, args);
  }

}
