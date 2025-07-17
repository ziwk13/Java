package chap11_ex;

public class Rectangle implements Shape {

  private double width;
  private double height;
  
  public Rectangle() { }
  public Rectangle(double width, double height) {
    super();
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }
  
  public double getWidth() {
    return width;
  }
  public void setWidth(double width) {
    this.width = width;
  }
  public double getHeight() {
    return height;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  
}
