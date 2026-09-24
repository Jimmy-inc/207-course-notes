/** this is a class that represents a rectangle. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * this records the dimensions of the rectangle.
   *
   * @param w is the width.
   * @param h is the height.
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * this returns the area of the rectangle.
   *
   * @return the area of the shape.
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * checks if the area of this is larger than one passed in.
   *
   * @return a bool telling if this rectangle is larger.
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
