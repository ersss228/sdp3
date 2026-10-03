package bridge;

public class Main {
  public static void main(String[] args) {

    Renderer vectorRenderer = new VectorRenderer();
    Renderer rasterRenderer = new RasterRenderer();

    Shape circle = new Circle(vectorRenderer, 5);
    Shape square = new Square(vectorRenderer, 10);

    circle.draw();
    square.draw();

    System.out.println("--- Switching Renderer ---");

    circle.setRenderer(rasterRenderer);
    square.setRenderer(rasterRenderer);

    circle.draw();
    square.draw();
  }
}
