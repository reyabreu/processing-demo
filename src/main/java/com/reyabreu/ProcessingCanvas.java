package com.reyabreu;

import java.awt.Point;
import java.awt.Rectangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import processing.core.PApplet;

/**
 * This is what would usually be written inside Processing's PDE editor. Note that we can use
 * annotations and other powerful features of Spring, including integration with Java Swing's
 * utility libraries.
 * 
 * @author Reynaldo.A
 *
 */
@Component
public class ProcessingCanvas extends PApplet
{

  private static final Logger logger = LoggerFactory.getLogger(ProcessingCanvas.class);

  private int left;
  private int right;
  private int top;
  private int bottom;

  private boolean canMove;

  private Rectangle boundsRect;


  @Override
  public void draw()
  {
    background(102);
    fill(204);
    if (canMove) {
      left = constrain(mouseX - 100, 10, 430);
      right = constrain(mouseX + 100, 210, 630);
      top = constrain(mouseY - 16, 10, 318);
      bottom = constrain(mouseY + 16, 42, 350);
      boundsRect.setBounds(left, top, right - left, bottom - top);
    }
    rect(left, top, right, bottom);
  }


  @Override
  public void settings()
  {
    size(640, 360);
  }


  @Override
  public void mouseMoved()
  {
    boolean oldState = canMove;
    canMove = boundsRect.contains(new Point(mouseX, mouseY));
    if (canMove != oldState) {
      logger.info("canMove: {}", canMove);
    }
  }


  @Override
  public void setup()
  {
    canMove = false;

    background(102);
    rectMode(CORNERS);
    noStroke();

    left = width / 2 - 100;
    right = width / 2 + 100;
    top = 150;
    bottom = 150 + 32;

    boundsRect = new Rectangle(left, top, right - left, bottom - top);
  }

}
