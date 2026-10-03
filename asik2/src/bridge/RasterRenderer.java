package bridge;

public class RasterRenderer implements Renderer {

  @Override
  public void renderCircle(double radius) {
    System.out.println("Drawing circle as raster, radius: " + radius);
  }

  @Override
  public void renderSquare(double side) {
    System.out.println("Drawing square as raster, side: " + side);
  }
}
