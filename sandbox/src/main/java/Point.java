package pl.qa.gm.sandbox;

/**
 * Created by ThinkPad on 10.12.2016.
 */
public class Point {

  public double p1;
  public double p2;

  public Point(double p1, double p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  public double distance() {
    return this.p1 - this.p2;
  }

}