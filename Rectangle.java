// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double w, double h, double oX, double oY) {
    this.width = w;
    this.height = h;
    this.originX = oX;
    this.originY = oY;
  }

  public Rectangle(double w, double h) {
    this(w, h, 0, 0);
  }

  public Rectangle() {
    this(1,1,0,0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  public void scale(double scaleX, double scaleY) {
    this.width *= scaleX;
    this.height *= scaleY;
  }

  public void scale(double scaleFactor) {
    this.width *= scaleFactor;
    this.height *= scaleFactor;
  }

  public boolean isOverlappedWith(Rectangle r) {
    boolean checkX = (this.originX < r.originX + r.width) && (this.originX > r.originX - r.width);
    boolean checkY = (this.originY < r.originY + r.height) && (this.originY > r.originY - r.width);
    if (checkX && checkY) return true;
    return false;
  }
  
}
