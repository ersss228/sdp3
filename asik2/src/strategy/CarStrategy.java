package strategy;

public class CarStrategy implements RouteStrategy {

  @Override
  public void buildRoute(String start, String destination) {
    System.out.println("Building a car route from "
      + start + " to " + destination);
  }
}
