package bridge;

public class VectorRenderer implements Renderer {

  @Override
  public void renderCircle(double radius) {
    System.out.println("Drawing circle as vector, radius: " + radius);
  }

  @Override
  public void renderSquare(double side) {
    System.out.println("Drawing square as vector, side: " + side);
  }
}
