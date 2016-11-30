package com.reyabreu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import processing.core.PApplet;

@Component
public class CommandLineStarter implements CommandLineRunner
{

  @Override
  public void run(String... args) throws Exception
  {
    PApplet.main(ProcessingCanvas.class);
    // Toolkit.getDefaultToolkit().setDynamicLayout(true);
  }

}
