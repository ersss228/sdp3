package strategy;

public class CyclingStrategy implements RouteStrategy {

  @Override
  public void buildRoute(String start, String destination) {
    System.out.println("Building a cycling route from "
      + start + " to " + destination);
  }
}
