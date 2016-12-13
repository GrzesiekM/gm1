package pl.qa.gm.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by ThinkPad on 13.12.2016.
 */
public class PointTest {

  @Test
  public void testDistance() {
    Point p = new pl.qa.gm.sandbox.Point(16,6);
    Assert.assertEquals ( p.distance(), 10.0);
  }

}
